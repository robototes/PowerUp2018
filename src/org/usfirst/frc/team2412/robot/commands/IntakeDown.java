package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class IntakeDown extends CommandBase 
{
	public IntakeDown()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeDown();
	}
}
