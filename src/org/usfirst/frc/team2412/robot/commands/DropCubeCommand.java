package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class DropCubeCommand extends CommandBase {

	private double startTime = 0;
	private double timeToSpin = 0.5;
	private boolean firstRun = true;
	
	public DropCubeCommand() {
		requires(intake);
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		System.out.println(firstRun);
		if(startTime == 0) {
			startTime = getTimeSeconds();
		}
		intake.spinWheelsOut();
		System.out.println("Dropping cube...");
	}
	
	@Override
	protected void end() {
		intake.stopWheels();
		startTime = 0;
	}
	
	@Override
	protected boolean isFinished() {
		System.out.println("Start time: " + startTime);
		System.out.println("Current time : " + getTimeSeconds());
		System.out.println(getTimeSeconds() - startTime);
		return getTimeSeconds() - startTime > timeToSpin;
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		return !PlateColorChecker.isSwitchCorrectColor();
	}
	
	private double getTimeSeconds() {
		return System.nanoTime() / 1E9d;
	}
}
