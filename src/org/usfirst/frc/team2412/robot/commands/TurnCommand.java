package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnCommand extends CommandBase {
	private boolean firstRun = true;
	private final double Kp = 0.65;
	
	public TurnCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		if(firstRun) {
			driveBase.resetAngle();
			firstRun = false;
		}
		double angle = 90 - driveBase.getAngle();
		driveBase.drive(0, angle*Kp/90, false);
	}
	
	@Override
	protected boolean isFinished() {
		return exitEarly() || Math.abs(90 - driveBase.getAngle()) < 1;
	}
	
	private boolean exitEarly() {
		return PlateColorChecker.getStartingPosition().equals("Center") || (!PlateColorChecker.isScaleCorrectColor() && !PlateColorChecker.isSwitchCorrectColor());
	}
	
	protected void end() {
		firstRun = true;
	}
}
