package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class ClimbUpCommand extends CommandBase {
public ClimbUpCommand() {
	requires(climber);
}
protected void execute() {
	if(RobotMap.driveNormally) {
		climber.climbUp();
	}
}
protected boolean isFinished() {
	return false;
}
}