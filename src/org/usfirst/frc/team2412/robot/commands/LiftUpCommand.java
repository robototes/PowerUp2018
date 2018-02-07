package org.usfirst.frc.team2412.robot.commands;

public class LiftUpCommand extends CommandBase {
	protected void execute () {
		lift.liftup();
	} 
	public LiftUpCommand() {
		requires (lift);	
	}
	protected boolean isFinished() {
		return true;
	}
}

