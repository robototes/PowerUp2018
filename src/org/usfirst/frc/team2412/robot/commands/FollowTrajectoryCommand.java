package org.usfirst.frc.team2412.robot.commands;

import java.io.File;

import org.usfirst.frc.team2412.robot.RobotMap;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.followers.DistanceFollower;

public class FollowTrajectoryCommand extends CommandBase {
	private boolean firstRun = true;
	private double startingValueLeft = 0;
	private double startingValueRight = 0;
	
	private DistanceFollower leftFollower;
	private DistanceFollower rightFollower;
	
	private final double encoderToFeetConversionLeft = 10 / 52285.0;
	private final double encoderToFeetConversionRight = 10 / 51939.0;
	
	public FollowTrajectoryCommand(String trajectoryName, double maxVelocity) {
		requires(driveBase);
		
		File leftPathFile = new File("/home/lvuser/" + trajectoryName + "_left_detailed.csv");
		Trajectory leftTrajectory = Pathfinder.readFromCSV(leftPathFile);
		leftFollower = new DistanceFollower(leftTrajectory);
		
		File rightPathFile = new File("/home/lvuser/" + trajectoryName +  "_right_detailed.csv");
		Trajectory rightTrajectory = Pathfinder.readFromCSV(rightPathFile);
		rightFollower = new DistanceFollower(rightTrajectory);
		
		leftFollower.configurePIDVA(1.0, 0.0, 0.0, 1 / maxVelocity, 0);
		rightFollower.configurePIDVA(1.0, 0.0, 0.0, 1 / maxVelocity, 0);
	}
	
	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(firstRun) {
			startingValueLeft = RobotMap.talons[2].getSelectedSensorPosition(0);
			startingValueRight = RobotMap.talons[3].getSelectedSensorPosition(0);
			firstRun = false;
		}
		double leftDistance = getDistanceFeetLeft();
		double leftSpeed = -leftFollower.calculate(leftDistance);
		
		double rightDistance = getDistanceFeetRight();
		double rightSpeed = rightFollower.calculate(rightDistance);
		
		double heading = driveBase.getAngle();
		double desiredHeading = Pathfinder.r2d(leftFollower.getHeading());
		
		double angleDifference = Pathfinder.boundHalfDegrees(desiredHeading - heading);
		double turn = 0.8 * (-1.0/80.0) * angleDifference;
		
		System.out.println("Left distance: " + getDistanceFeetLeft());
		System.out.println("Right distance: " + getDistanceFeetRight());
		
		driveBase.setSideSpeeds(leftSpeed + turn, rightSpeed - turn);
	}
	
	//Gets the distance that the robot's left side has traveled in feet.
	private double getDistanceFeetLeft() {
		return (RobotMap.talons[2].getSelectedSensorPosition(0) - startingValueLeft) * encoderToFeetConversionLeft;
	}
	
	//Gets the distance that the robot's right side has traveled in feet.
	private double getDistanceFeetRight() {
		return (RobotMap.talons[3].getSelectedSensorPosition(0) - startingValueRight) * encoderToFeetConversionRight;
	}
	
	@Override
	protected boolean isFinished() {
		return leftFollower.isFinished() && rightFollower.isFinished();
	}
	
	// Called once after isFinished returns true
	@Override
	protected void end() {
		firstRun = true;
	}
}
