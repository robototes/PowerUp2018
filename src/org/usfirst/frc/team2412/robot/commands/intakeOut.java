package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.IntakeSubsystem;

public class intakeOut extends CommandBase 
{
	public intakeOut()
	{
		requires(intake);
	}
	public void execute()
	{
		intake.spinWheelsOut();
	}
}
