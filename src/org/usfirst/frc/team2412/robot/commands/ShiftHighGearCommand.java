package org.usfirst.frc.team2412.robot.commands;

public class ShiftHighGearCommand extends CommandBase {
	
	public ShiftHighGearCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		driveBase.shiftHighGear();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
