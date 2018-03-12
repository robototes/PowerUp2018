package org.usfirst.frc.team2412.robot.commands;
public class ClimbDownCommand extends CommandBase {
	public ClimbDownCommand() {
		requires(climber);
	}
	protected void execute() {
		climber.climbDown();
	}
	protected boolean isFinished() {
		return false;
	}
}
