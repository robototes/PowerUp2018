package org.usfirst.frc.team2412.robot.commands;


public class intakeOpen extends CommandBase 
{
	public intakeOpen()
	{
		requires(intakeOpenClose);
	}
	
	public void execute()
	{
		intakeOpenClose.intakeOpen();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
