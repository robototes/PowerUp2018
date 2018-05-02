package org.usfirst.frc.team2412.robot.commands;

public class DriveForwardCommand extends CommandBase {
	// Distance to drive (encoder units).
	private double distanceToDrive = 0;
	
	// Heading to maintain while driving (degrees).
	private double angleToTurn = 0;
	
	// P for turning.
	private double Tp = 2;
	
	public DriveForwardCommand(double driveDistance) {
		this(driveDistance, 0, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle) {
		this(driveDistance, angle, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle, double Tp) {
		this.distanceToDrive = driveDistance;
		this.angleToTurn = angle;
		this.Tp = Tp;
	}
}
