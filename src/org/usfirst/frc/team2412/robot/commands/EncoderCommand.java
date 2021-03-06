package org.usfirst.frc.team2412.robot.commands;

public class EncoderCommand extends CommandBase {
	private double distanceToDrive = 0;
	
	private double Kp = 2;
	
	private double angleToTurn = 0;
	
	private double driveSpeed = 0.5;
	
	public EncoderCommand(double speed, double driveDistance) {
		driveSpeed = speed;
		distanceToDrive = driveDistance;
		// Use requires() here to declare subsystem dependencies
		requires(driveBase);
	}
	
	public EncoderCommand(double speed, double driveDistance, double angle) {
		this(speed, driveDistance);
		angleToTurn = angle;
	}
	
	public EncoderCommand(double speed, double driveDistance, double angle, double p) {
		this(speed, driveDistance, angle);
		Kp = p;
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
		System.out.println("RUNNING ENCODERCOMMAND");
		System.out.println("DRIVING TO: " + distanceToDrive);
		System.out.println("Left: " + Math.abs(driveBase.getLeftEncoderValue()));
		System.out.println("Right: " + Math.abs(driveBase.getRightEncoderValue()));
		driveBase.drive(driveSpeed, -Kp * (angleToTurn - driveBase.getAngle()) / 90, false);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return exitEarly() || Math.abs(driveBase.getLeftEncoderValue()) > Math.abs(distanceToDrive) && Math.abs(driveBase.getRightEncoderValue()) > Math.abs(distanceToDrive);
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
}
