package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnCommand extends CommandBase {
	private boolean firstRun = true;
	private final double Kp = 1.0; /* 1.1 is close (10 degrees short) */
	private final double Ki = 0.0075;
	
	private double previousError = 0;
	private double error = 0;
	private double angleToTurn = 90;
	private double integral = 0;
	
	public TurnCommand(double angle) {
		requires(driveBase);
		angleToTurn = angle;
	}
	
	public TurnCommand() {
		requires(driveBase);
		angleToTurn = 90;
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		if(firstRun) {
			firstRun = false;
			angleToTurn = getAngleToTurn();
		}
		error = getError();
		integral += (error/90d);
		double turnValue = error*Kp/90 + Ki*integral;
		driveBase.drive(0, -turnValue, false);
		System.out.println("Turn: " + turnValue);
		previousError = error;
	}
	
	@Override
	protected boolean isFinished() {
		return exitEarly() || Math.abs(getError()) < 1;
	}
	
	private boolean exitEarly() {
		return PlateColorChecker.useDefault();
	}
	
	protected void end() {
		firstRun = true;
	}
	
	private double getError() {
		return angleToTurn - driveBase.getAngle();
	}
	
	protected double getAngleToTurn() {
		return angleToTurn;
	}
}
