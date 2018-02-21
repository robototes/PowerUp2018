package org.usfirst.frc.team2412.robot.commands;

public class EncoderGameDataCommand extends EncoderCommand {

	private double distanceToDriveLeft;
	private double distanceToDriveRight;
	public EncoderGameDataCommand(double speed, double leftDistance, double rightDistance) {
		super(speed, 0);
		distanceToDriveLeft = leftDistance;
		distanceToDriveRight = rightDistance;
	}
}
