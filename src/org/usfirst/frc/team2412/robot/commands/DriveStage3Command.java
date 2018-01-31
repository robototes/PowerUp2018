package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class DriveStage3Command extends EncoderCommand {

	public DriveStage3Command(double leftDistance, double centerDistance,
			double rightDistance) {
		super(leftDistance, centerDistance, rightDistance);
	}
	
	public DriveStage3Command(double leftDistance, double centerDistance,
			double rightDistance, double angle) {
		super(leftDistance, centerDistance, rightDistance, angle);
	}

	protected boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		return !PlateColorChecker.getStartingPosition().equals("Center") &&
				!PlateColorChecker.isSwitchCorrectColor();
	}
	
	protected double getDistanceToDrive() {
		switch(PlateColorChecker.getStartingPosition()) {
		case "Center":
			return distanceToDriveCenter;
		case "Right":
			return distanceToDriveRight;
		default:
			return distanceToDriveLeft;
		}
	}
}
