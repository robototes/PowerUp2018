package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;
import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

public class EncoderCommand extends CommandBase {
	private boolean firstRun = true;
	private double startingValueLeft = 0;
	private double startingValueRight = 0;
	
	protected double distanceToDriveLeft;
	protected double distanceToDriveCenter;
	protected double distanceToDriveRight;
	
	private double distanceToDrive = 0;
	
	private final double Kp = 2;
	
	private double angleToTurn = 0;
	
	public EncoderCommand(double leftDistance, double centerDistance, double rightDistance) {
		distanceToDriveLeft = leftDistance;
		distanceToDriveCenter = centerDistance;
		distanceToDriveRight = rightDistance;
		// Use requires() here to declare subsystem dependencies
		requires(driveBase);
	}
	
	public EncoderCommand(double leftDistance, double centerDistance, double rightDistance, double angle) {
		this(leftDistance, centerDistance, rightDistance);
		angleToTurn = angle;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		RobotMap.talons[2].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		RobotMap.talons[3].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
	}
	
	@Override
	public void start() {
		super.start();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		if(firstRun) {
			startingValueLeft = RobotMap.talons[2].getSelectedSensorPosition(0);
			startingValueRight = RobotMap.talons[3].getSelectedSensorPosition(0);
			firstRun = false;
			distanceToDrive = getDistanceToDrive();
			if(PlateColorChecker.getStartingPosition().equals("Left")) {
				angleToTurn = -Math.abs(angleToTurn);
			} else if(PlateColorChecker.getStartingPosition().equals("Right")) {
				angleToTurn = Math.abs(angleToTurn);
			}
		}
		System.out.println(Math.abs(RobotMap.talons[2].getSelectedSensorPosition(0) - startingValueLeft));
		System.out.println(Math.abs(RobotMap.talons[3].getSelectedSensorPosition(0) - startingValueRight));
		driveBase.drive(0.5, Kp * (angleToTurn - driveBase.getAngle()) / 90, false);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return exitEarly() || Math.abs(RobotMap.talons[2].getSelectedSensorPosition(0) - startingValueLeft) > distanceToDrive && Math.abs(RobotMap.talons[3].getSelectedSensorPosition(0) - startingValueRight) > distanceToDrive;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		firstRun = true;
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
	
	// If we need to exit the command early.
	protected boolean exitEarly() {
		return false;
	}
	
	// Decides which distance to drive.
	protected double getDistanceToDrive() {
		switch(PlateColorChecker.getStartingPosition()) {
		case "Center":
			return distanceToDriveCenter;
		case "Right":
			return distanceToDriveRight;
		default:
			return distanceToDriveLeft;
		}
	}
}
