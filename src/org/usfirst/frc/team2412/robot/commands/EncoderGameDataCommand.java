package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class EncoderGameDataCommand extends EncoderCommand {

	private double distanceToDriveLeft;
	private double distanceToDriveRight;
	
	public EncoderGameDataCommand(double speed, double leftDistance, double rightDistance) {
		super(speed, 0);
		distanceToDriveLeft = leftDistance;
		distanceToDriveRight = rightDistance;
	}
	
	public EncoderGameDataCommand(double speed, double leftDistance, double rightDistance, double angle) {
		super(speed, 0, angle);
		distanceToDriveLeft = leftDistance;
		distanceToDriveRight = rightDistance;
	}
	
	// Decides which distance to drive.
	protected double getDistanceToDrive() {
		if(PlateColorChecker.isLeftSwitchCorrectColor()) {
			return distanceToDriveLeft;
		} else {
			return distanceToDriveRight;
		}
	}
}
