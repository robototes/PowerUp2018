package org.usfirst.frc.team2412.robot.commands;

public class TurnCommand extends CommandBase {
	
	public TurnCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		driveBase.drive(0, 0.5, false);
	}
	
	@Override
	protected boolean isFinished() {
		return driveBase.getAngle() > 90;
	}
}
