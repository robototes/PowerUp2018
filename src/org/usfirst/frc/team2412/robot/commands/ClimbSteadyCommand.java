package org.usfirst.frc.team2412.robot.commands;

public class ClimbSteadyCommand extends CommandBase {
public ClimbSteadyCommand() {
	requires(climber);
}
protected void execute() {
	climber.climbUp();
}
protected boolean isFinished() {
	return false;
}
}
