package org.usfirst.frc.team2412.robot.commands;


public class IntakeDown extends CommandBase 
{
	public IntakeDown()
	{
		requires(intakeUpDown);
	}
	
	public void execute()
	{
		intakeUpDown.intakeDown();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
