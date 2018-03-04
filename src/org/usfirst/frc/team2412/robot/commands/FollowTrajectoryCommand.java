package org.usfirst.frc.team2412.robot.commands;

import java.io.File;

import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.followers.DistanceFollower;

public class FollowTrajectoryCommand extends CommandBase {
	private DistanceFollower leftFollower;
	private DistanceFollower rightFollower;
	
	public FollowTrajectoryCommand(String trajectoryName, double maxVelocity) {
		requires(driveBase);
		
		File leftPathFile = new File("D:\\Paths\\Generated\\Left Switch_left_detailed.csv");
		Trajectory leftTrajectory = Pathfinder.readFromCSV(leftPathFile);
		leftFollower = new DistanceFollower(leftTrajectory);
		
		File rightPathFile = new File("D:\\Paths\\Generated\\Left Switch_left_detailed.csv");
		Trajectory rightTrajectory = Pathfinder.readFromCSV(rightPathFile);
		rightFollower = new DistanceFollower(rightTrajectory);
		
		leftFollower.configurePIDVA(1.0, 0.0, 0.0, 1 / maxVelocity, 0);
		rightFollower.configurePIDVA(1.0, 0.0, 0.0, 1 / maxVelocity, 0);
	}

}
