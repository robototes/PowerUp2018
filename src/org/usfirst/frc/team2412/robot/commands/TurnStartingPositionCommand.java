package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnStartingPositionCommand extends TurnCommand {
	public TurnStartingPositionCommand(int angle) {
		super(angle);
	}
	
	protected double getAngleToTurn() {
		if(PlateColorChecker.getStartingPosition().equals("Left")) {
			return -super.getAngleToTurn();
		} else {
			return super.getAngleToTurn();
		}
	}
}
