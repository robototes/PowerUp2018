package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class ShiftHighGearCommand extends CommandBase {
	
	public ShiftHighGearCommand() {
		requires(driveShifters);
	}
	
	@Override
	protected void execute() {
		if(RobotMap.driveNormally) {
			driveShifters.shiftHighGear();
		}
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
