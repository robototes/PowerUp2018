package org.usfirst.frc.team2412.robot.commands;

public class ClimbCommand extends CommandBase {
public ClimbCommand() {
	requires(climber);
}
protected void execute() {
	climber.climb();
}
protected boolean isFinished() {
	return false;
}
protected void end() {
	climber.stopClimb();
}
}