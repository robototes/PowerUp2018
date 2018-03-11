package org.usfirst.frc.team2412.robot.commands;


public class intakeClose extends CommandBase 
{
	public intakeClose()
	{
		requires(intakeOpenClose);
	}
	
	public void execute()
	{
		intakeOpenClose.intakeClose();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
