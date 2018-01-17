package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class WaitCommand extends CommandBase {

	public WaitCommand() {
		
	}
	
	protected void execute() {
		Timer.delay(1);
	}
	
	protected boolean isFinished() {
		return true;
	}
}
