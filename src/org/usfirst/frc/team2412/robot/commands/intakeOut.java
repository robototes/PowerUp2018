package org.usfirst.frc.team2412.robot.commands;


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
