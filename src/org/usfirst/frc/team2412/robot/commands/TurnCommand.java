package org.usfirst.frc.team2412.robot.commands;

public class TurnCommand extends CommandBase {
	
	public TurnCommand() {
		requires(driveBase);
	}
	
	@Override
	protected void execute() {
		System.out.println("Hello, world!");
	}
}
