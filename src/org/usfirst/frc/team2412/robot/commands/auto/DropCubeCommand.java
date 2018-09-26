package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.PlateColorChecker;
import org.usfirst.frc.team2412.robot.commands.CommandBase;

public class DropCubeCommand extends CommandBase {

	private double startTime = 0;
	private double timeToSpin = 0.5;
	private boolean firstRun = true;
	
	public DropCubeCommand() {
		requires(intakeInOut);
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
		intakeInOut.spinWheelsOut();
		System.out.println("Dropping cube...");
	}
	
	@Override
	protected void end() {
		intakeInOut.stopWheels();
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
		return false;
//		return PlateColorChecker.useDefault();
	}
	
	private double getTimeSeconds() {
		return System.nanoTime() / 1E9d;
	}
}
