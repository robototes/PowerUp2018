package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class DriveLimitSwitchCommand extends CommandBase {
	
	public DriveLimitSwitchCommand() {
		requires(driveBase);
	}
	
	protected void execute() {
		driveBase.drive(0.5, 0, false);
	}
	
	protected boolean isFinished() {
		return RobotMap.limitSwitch.get();
	}
}
