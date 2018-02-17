package org.usfirst.frc.team2412.robot.commands;


public class intakeClose extends CommandBase 
{
	public intakeClose()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeClose();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
