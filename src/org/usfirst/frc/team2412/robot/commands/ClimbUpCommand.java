package org.usfirst.frc.team2412.robot.commands;

public class ClimbUpCommand extends CommandBase {
public ClimbUpCommand() {
	requires(climber);
}
protected void execute() {
	climber.climbUp();
}
protected boolean isFinished() {
	return false;
}
}