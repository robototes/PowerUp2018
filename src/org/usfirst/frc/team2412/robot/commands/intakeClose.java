package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class intakeClose extends CommandBase 
{
	public intakeClose()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeClose();
	}
}
