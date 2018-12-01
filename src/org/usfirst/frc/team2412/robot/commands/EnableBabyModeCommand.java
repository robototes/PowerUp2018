package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class EnableBabyModeCommand extends CommandBase {

	@Override
	protected void execute() {
		RobotMap.driveNormally = true;
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		RobotMap.driveNormally = false;
	}
}
