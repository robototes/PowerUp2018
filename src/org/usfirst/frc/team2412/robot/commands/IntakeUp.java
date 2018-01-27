package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class IntakeUp extends CommandBase 
{
	public IntakeUp()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeup();
	}
}
