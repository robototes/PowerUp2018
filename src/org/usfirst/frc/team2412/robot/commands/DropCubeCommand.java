package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class DropCubeCommand extends CommandBase {

	public DropCubeCommand() {
//		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		if(exitEarly()) {
			return;
		}
		System.out.println("Dropping cube...");
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
	
	private boolean exitEarly() {
		if(PlateColorChecker.getStartingPosition().equals("Center")) {
			return !PlateColorChecker.isSwitchCorrectColor();
		} else {
			return !PlateColorChecker.isScaleCorrectColor() 
				&& !PlateColorChecker.isSwitchCorrectColor();
		}
	}
}
