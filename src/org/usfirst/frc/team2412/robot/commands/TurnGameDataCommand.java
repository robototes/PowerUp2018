package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

public class TurnGameDataCommand extends TurnCommand {
	public TurnGameDataCommand(int angle) {
		super(angle);
	}

	protected double getAngleToTurn() {
		if(PlateColorChecker.isLeftSwitchCorrectColor()) {
			return -super.getAngleToTurn();
		} else {
			return super.getAngleToTurn();
		}
	}
}
