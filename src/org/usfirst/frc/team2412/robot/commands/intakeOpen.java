package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class intakeOpen extends CommandBase 
{
	public intakeOpen()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeOpen();
	}
}
