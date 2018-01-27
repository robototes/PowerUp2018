package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;
import org.usfirst.frc.team2412.robot.RobotMap;

public class DriveLimitSwitchCommand extends CommandBase {
	
	public DriveLimitSwitchCommand() {
		requires(driveBase);
	}
	
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		driveBase.drive(0.5, 0, false);
	}
	
	protected boolean isFinished() {
		return exitEarly() || RobotMap.limitSwitch.get();
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.getAutonomousMode().equals("Drive forward")) return true;
		return !PlateColorChecker.getStartingPosition().equals("Center") && !PlateColorChecker.isScaleCorrectColor() && !PlateColorChecker.isSwitchCorrectColor();
	}
}
