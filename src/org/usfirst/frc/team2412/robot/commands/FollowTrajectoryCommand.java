package org.usfirst.frc.team2412.robot.commands;

import java.io.File;

import org.usfirst.frc.team2412.robot.RobotMap;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.followers.DistanceFollower;

public class FollowTrajectoryCommand extends CommandBase {
	private DistanceFollower leftFollower;
	private DistanceFollower rightFollower;
	
	private final double encoderToFeetConversionLeft = 52285.0 / 10;
	private final double encoderToFeetConversionRight = 51939.0 / 10;
	
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
		double leftDistance = getDistanceFeetLeft();
		double leftSpeed = leftFollower.calculate(leftDistance);
		
		double rightDistance = getDistanceFeetRight();
		double rightSpeed = rightFollower.calculate(rightDistance);
		
		driveBase.setSideSpeeds(leftSpeed, rightSpeed);
	}
	
	//Gets the distance that the robot's left side has traveled in feet.
	private double getDistanceFeetLeft() {
		return RobotMap.talons[2].getSelectedSensorPosition(0) * encoderToFeetConversionLeft;
	}
	
	//Gets the distance that the robot's right side has traveled in feet.
	private double getDistanceFeetRight() {
		return RobotMap.talons[3].getSelectedSensorPosition(0) * encoderToFeetConversionRight;
	}
}
