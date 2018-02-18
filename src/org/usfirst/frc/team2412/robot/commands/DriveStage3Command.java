package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class DriveStage3Command extends EncoderCommand {

	public DriveStage3Command(double speed, double leftDistance, double centerDistance,
			double rightDistance) {
		super(speed, leftDistance, centerDistance, rightDistance);
	}
	
	public DriveStage3Command(double speed, double leftDistance, double centerDistance,
			double rightDistance, double angle) {
		super(speed, leftDistance, centerDistance, rightDistance, angle);
	}

	protected boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		if (PlateColorChecker.getStartingPosition().equals("Center")) return true;
		return !PlateColorChecker.isSwitchCorrectColor();
	}
}
