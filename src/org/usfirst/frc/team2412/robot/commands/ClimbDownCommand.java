package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class ClimbDownCommand extends CommandBase {
	public ClimbDownCommand() {
		requires(climber);
	}
	protected void execute() {
		if(RobotMap.driveNormally) {
			climber.climbDown();
		}
	}
	protected boolean isFinished() {
		return false;
	}
}
