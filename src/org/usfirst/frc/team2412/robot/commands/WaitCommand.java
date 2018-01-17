package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class WaitCommand extends CommandBase {

	double secondsToWait = 1;
	
	public WaitCommand(double _secondsToWait) {
		this.secondsToWait = _secondsToWait;
	}
	
	protected void execute() {
		Timer.delay(secondsToWait);
	}
	
	protected boolean isFinished() {
		return true;
	}
}
