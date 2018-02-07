package org.usfirst.frc.team2412.robot.commands;

public class LiftDownCommand extends CommandBase {
	protected void execute () {
		lift.liftdown();
		
	} 
	public LiftDownCommand() {
		requires (lift);	
	}
	protected boolean isFinished() {
		return true;
	}
}