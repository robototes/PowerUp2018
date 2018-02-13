package org.usfirst.frc.team2412.robot.commands;


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
