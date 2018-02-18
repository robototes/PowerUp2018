package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnCommand extends CommandBase {
	private boolean firstRun = true;
	private final double Kp = 0.17;
	private final double Ki = 0.003;
	
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
			if(PlateColorChecker.getStartingPosition().equals("Left")) {
				angleToTurn = -Math.abs(angleToTurn);
			} else if(PlateColorChecker.getStartingPosition().equals("Right")) {
				angleToTurn = Math.abs(angleToTurn);
			}
			firstRun = false;
		}
		error = getError();
		integral += (error/90d);
		double turnValue = error*Kp/90 + Ki*integral;
		driveBase.drive(0, turnValue, false);
		System.out.println("Turning...");
		previousError = error;
	}
	
	@Override
	protected boolean isFinished() {
		return exitEarly() || Math.abs(getError()) < 1;
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		return PlateColorChecker.getStartingPosition().equals("Center") || !PlateColorChecker.isSwitchCorrectColor();
	}
	
	protected void end() {
		firstRun = true;
	}
	
	private double getError() {
		return angleToTurn - driveBase.getAngle();
	}
}
