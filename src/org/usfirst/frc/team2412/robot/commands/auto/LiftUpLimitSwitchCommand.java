package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.PlateColorChecker;
import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class LiftUpLimitSwitchCommand extends CommandBase {
	
	public LiftUpLimitSwitchCommand() {
		requires(lift);
	}
	
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		lift.liftup();
	}
	
	protected boolean isFinished() {
		return exitEarly() || RobotMap.limitSwitch.get();
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		return !PlateColorChecker.getStartingPosition().equals("Center") && !PlateColorChecker.isScaleCorrectColor() && !PlateColorChecker.isSwitchCorrectColor();
	}
}
