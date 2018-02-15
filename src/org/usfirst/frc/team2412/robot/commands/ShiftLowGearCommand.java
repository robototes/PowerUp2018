package org.usfirst.frc.team2412.robot.commands;

public class ShiftLowGearCommand extends CommandBase {
	
	public ShiftLowGearCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		driveBase.shiftLowGear();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
