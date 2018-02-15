package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class DropCubeCommand extends CommandBase {

	private double startTime = 0;
	private double timeToSpin = 1;
	
	public DropCubeCommand() {
		requires(intake);
	}
	
	@Override
	public void start() {
		super.start();
		startTime = getTimeSeconds();
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		intake.spinWheelsOut();
	}
	
	@Override
	protected void end() {
		intake.stopWheels();
	}
	
	@Override
	protected boolean isFinished() {
		return getTimeSeconds() - startTime > timeToSpin;
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.useDefault()) return true;
		return !PlateColorChecker.isSwitchCorrectColor();
	}
	
	private double getTimeSeconds() {
		return System.nanoTime() / 1E9;
	}
}
