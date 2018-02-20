package org.usfirst.frc.team2412.robot.commands;

public class ShiftLowGearCommand extends CommandBase {
	
	public ShiftLowGearCommand() {
		requires(driveShifters);
	}
	
	@Override
	protected void execute() {
		driveShifters.shiftLowGear();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
