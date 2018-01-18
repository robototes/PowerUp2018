package org.usfirst.frc.team2412.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DriverStation;

public class PlateColorChecker {
	
	private static NetworkTableInstance tableInstance = NetworkTableInstance.getDefault();
	private static NetworkTable table = tableInstance.getTable("PyDashboard");
	
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
	
	public static boolean isSwitchCorrectColor() {
		String selected = table.getEntry("startingPosition").getString("unknown");
		if(selected.equals("Left")) {
			return isLeftSwitchCorrectColor();
		} else {
			return isRightSwitchCorrectColor();
		}
	}
	
	public static boolean isScaleCorrectColor() {
		String selected = table.getEntry("startingPosition").getString("unknown");
		if(selected.equals("Left")) {
			return isLeftScaleCorrectColor();
		} else {
			return isRightScaleCorrectColor();
		}
	}
}
