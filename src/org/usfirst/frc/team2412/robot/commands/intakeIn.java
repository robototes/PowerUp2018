package org.usfirst.frc.team2412.robot.commands;


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
	protected void end() {
		intake.stopWheels();
	}
}
