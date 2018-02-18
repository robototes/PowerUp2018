package org.usfirst.frc.team2412.robot.commands;

public class AutoIntakeInCommand extends intakeIn {
	private double startTime = 0;
	private double timeToSpin = 0.5;
	
	@Override
	public void execute() {
		super.execute();
		if(startTime == 0) {
			startTime = getTimeSeconds();
		}
		System.out.println("Intaking cube...");
	}
	
	@Override
	protected boolean isFinished() {
		System.out.println("Start time: " + startTime);
		System.out.println("Current time : " + getTimeSeconds());
		System.out.println(getTimeSeconds() - startTime);
		return getTimeSeconds() - startTime > timeToSpin;
	}
	
	private double getTimeSeconds() {
		return System.nanoTime() / 1E9d;
	}
}
