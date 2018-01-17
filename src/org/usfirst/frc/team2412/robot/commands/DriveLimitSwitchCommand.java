package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class DriveLimitSwitchCommand extends CommandBase {
	
	public DriveLimitSwitchCommand() {
		requires(driveBase);
	}
	
	protected void execute() {
		System.out.println("Driving...");
	}
	
	protected boolean isFinished() {
		return RobotMap.limitSwitch.get();
	}
}
