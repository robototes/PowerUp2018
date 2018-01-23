/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;



/**
 * An example command.  You can replace me with your own command.
 */
public class DriveXFeetCommand extends EncoderCommand {

	public DriveXFeetCommand(double leftDistance, double centerDistance,
			double rightDistance) {
		super(leftDistance, centerDistance, rightDistance);
	}
	
	protected boolean exitEarly() {
		return PlateColorChecker.getStartingPosition().equals("Center");
	}
	
	protected double getDistanceToDrive() {
		return distanceToDriveLeft;
	}
}
