package org.usfirst.frc.team2412.robot.commands;

public class LiftSteadyCommand extends CommandBase {
	protected void execute () {
		lift.holdsteady();
	} 
	public LiftSteadyCommand() {
		requires (lift);	
	}
	protected boolean isFinished() {
		return false;
	}
}

