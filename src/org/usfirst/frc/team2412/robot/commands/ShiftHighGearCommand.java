package org.usfirst.frc.team2412.robot.commands;

public class ShiftHighGearCommand extends CommandBase {
	
	public ShiftHighGearCommand() {
		requires(driveShifters);
	}
	
	@Override
	protected void execute() {
		driveShifters.shiftHighGear();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
