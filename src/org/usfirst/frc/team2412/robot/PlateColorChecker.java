package org.usfirst.frc.team2412.robot;

import edu.wpi.first.wpilibj.DriverStation;

public class PlateColorChecker {

	public static boolean isLeftSwitchCorrectColor() {
		return messageToCharArray()[0] == 'L';
	}
	
	public static boolean isRightSwitchCorrectColor() {
		return messageToCharArray()[0] == 'R';
	}
	
	public static boolean isLeftScaleCorrectColor() {
		return messageToCharArray()[1] == 'L';
	}
	
	public static boolean isRightScaleCorrectColor() {
		return messageToCharArray()[1] == 'R';
	}
	
	private static char[] messageToCharArray() {
		return DriverStation.getInstance().getGameSpecificMessage().toCharArray(); 
	}
	
}
