package org.usfirst.frc.team2412.robot.commands;

public class TimedEncoderCommand extends EncoderCommand {
	
	public TimedEncoderCommand(double speed, double driveDistance, double angle, double p, double timeElapsed) {
		super(speed, driveDistance, angle, p);
		this.timeElapsed = timeElapsed; 
	}

	private long startTime = 0;
	private double timeElapsed;
	
	@Override
	public void start() {
		super.start();
		startTime = System.nanoTime();
	}
	
	@Override
	protected boolean isFinished() {
		return (System.nanoTime() - startTime) < timeElapsed || super.isFinished();
	}
}
