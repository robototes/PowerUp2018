package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	//Intake Subsystem --
	public static IntakeSubsystem intake = new IntakeSubsystem();
	
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}


}
