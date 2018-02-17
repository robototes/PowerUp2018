package org.usfirst.frc.team2412.robot.commands;


public class IntakeDown extends CommandBase 
{
	public IntakeDown()
	{
		requires(intake);
	}
	
	public void execute()
	{
		intake.intakeDown();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
