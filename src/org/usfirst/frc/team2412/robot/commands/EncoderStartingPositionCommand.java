package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class EncoderStartingPositionCommand extends EncoderCommand {
	
	protected double distanceToDriveLeft;
	protected double distanceToDriveCenter;
	protected double distanceToDriveRight;
	
	public EncoderStartingPositionCommand(double speed, double leftDistance, double centerDistance, double rightDistance) {
		super(speed, 0);
		distanceToDriveLeft = leftDistance;
		distanceToDriveCenter = centerDistance;
		distanceToDriveRight = rightDistance;
	}
	
	public EncoderStartingPositionCommand(double speed, double leftDistance, double centerDistance, double rightDistance, double angle) {
		super(speed, 0, angle);
		distanceToDriveLeft = leftDistance;
		distanceToDriveCenter = centerDistance;
		distanceToDriveRight = rightDistance;
	}
	
	// Decides which distance to drive.
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
