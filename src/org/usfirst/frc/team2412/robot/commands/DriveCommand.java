package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

public class DriveCommand extends CommandBase {

	public DriveCommand() {
		requires(driveBase);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	protected void execute() {
		driveBase.drive(Robot.m_oi.stick);
	}
}
