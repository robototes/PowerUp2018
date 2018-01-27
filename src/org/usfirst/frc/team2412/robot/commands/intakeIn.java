package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class intakeIn extends CommandBase 
{
	public intakeIn()
	{
		requires(intake);
	}
	public void execute()
	{
		intake.spinWheelsIn();
	}
}
