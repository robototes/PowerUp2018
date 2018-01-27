package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class IntakeClose extends CommandBase 
{
	public IntakeClose()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeClose();
	}
}
