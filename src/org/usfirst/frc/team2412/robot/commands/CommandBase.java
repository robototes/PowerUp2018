package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.LiftSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {

	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static LiftSubsystem lift = new LiftSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
