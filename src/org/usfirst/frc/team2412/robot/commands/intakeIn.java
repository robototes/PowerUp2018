package org.usfirst.frc.team2412.robot.commands;


public class intakeIn extends CommandBase 
{
	public intakeIn()
	{
		requires(intakeInOut);
	}
	public void execute()
	{
		intakeInOut.spinWheelsIn();
	}
	protected void end() {
		intakeInOut.stopWheels();
	}
}
