package org.usfirst.frc.team2412.robot.commands;


public class intakeOut extends CommandBase 
{
	public intakeOut()
	{
		requires(intakeInOut);
	}
	public void execute()
	{
		intakeInOut.spinWheelsOut();
	}
	protected void end() {
		intakeInOut.stopWheels();
	}
}
