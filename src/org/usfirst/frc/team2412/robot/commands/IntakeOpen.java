package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class IntakeOpen extends CommandBase 
{
	public IntakeOpen()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeOpen();
	}
}
