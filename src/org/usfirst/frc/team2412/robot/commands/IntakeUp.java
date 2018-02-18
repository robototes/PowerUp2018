package org.usfirst.frc.team2412.robot.commands;


public class IntakeUp extends CommandBase 
{
	public IntakeUp()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeup();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
