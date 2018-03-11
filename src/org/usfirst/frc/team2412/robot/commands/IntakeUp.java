package org.usfirst.frc.team2412.robot.commands;


public class IntakeUp extends CommandBase 
{
	public IntakeUp()
	{
		requires(intakeUpDown);
	}
	
	public void execute()
	{
		intakeUpDown.intakeup();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
