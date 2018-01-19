package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnCommand extends CommandBase {
	
	public TurnCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		driveBase.drive(0, 0.4, false);
	}
	
	@Override
	protected boolean isFinished() {
		return exitEarly() || driveBase.getAngle() > 90;
	}
	
	private boolean exitEarly() {
		return PlateColorChecker.getStartingPosition().equals("Center") || (!PlateColorChecker.isScaleCorrectColor() && !PlateColorChecker.isSwitchCorrectColor());
	}
}
