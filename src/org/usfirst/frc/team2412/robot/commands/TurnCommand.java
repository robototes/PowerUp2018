package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnCommand extends CommandBase {
	private boolean firstRun = true;
	private double angleToTurn = 90;
	
	public TurnCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		if(firstRun) {
			if(PlateColorChecker.getStartingPosition().equals("Left")) {
				angleToTurn = Math.abs(angleToTurn);
			} else if(PlateColorChecker.getStartingPosition().equals("Right")) {
				angleToTurn = -Math.abs(angleToTurn);
			}
			firstRun = false;
			driveBase.setSetpoint(angleToTurn);
			driveBase.getPIDController().enable();
			driveBase.setAbsoluteTolerance(5); //Tolerate 5 degrees either way.
		}
		System.out.println("Turning...");
		double calculatedValue = driveBase.getPIDController().get();
		System.out.println("Calculated value: " + calculatedValue);
		System.out.println("Position: " + driveBase.getPosition());
		
	}
	
	@Override
	protected boolean isFinished() {
//		return exitEarly() || Math.abs(getError()) < 1;
		return driveBase.onTarget();
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
