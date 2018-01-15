package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
