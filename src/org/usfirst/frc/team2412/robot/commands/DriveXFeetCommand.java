/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;
import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;


/**
 * An example command.  You can replace me with your own command.
 */
public class DriveXFeetCommand extends CommandBase {
	private boolean firstRun = true;
	private double startingValueLeft = 0;
	private double startingValueRight = 0;
	
	private double distanceToDrive = 5000;
	
	public DriveXFeetCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(driveBase);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		RobotMap.talons[0].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		RobotMap.talons[1].configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Hello, world!");
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(PlateColorChecker.getStartingPosition().equals("Center")) {
			return;
		}
		System.out.println("First run: " + firstRun);
		if(firstRun) {
			System.out.println(firstRun);
			startingValueLeft = RobotMap.talons[0].getSelectedSensorPosition(0);
			startingValueRight = RobotMap.talons[1].getSelectedSensorPosition(0);
//			RobotMap.talons[0].setSelectedSensorPosition(0, 0, 0);
//			RobotMap.talons[1].setSelectedSensorPosition(0, 0, 0);
			firstRun = false;
			System.out.println(Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0)));
			System.out.println(Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0)));
			
			if(!PlateColorChecker.isSwitchCorrectColor() && PlateColorChecker.isScaleCorrectColor()) {
				//If the switch is the wrong color but the scale is the right color, go for the scale.
				distanceToDrive = 10000; //TODO change this to 324 inches.
			} else {
				//Otherwise, go for the switch.
				distanceToDrive = 5000; //TODO change this to 168 inches.
			}
		}
		System.out.println(Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0) - startingValueLeft));
		System.out.println(Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0) - startingValueRight));
		driveBase.drive(0.5, 0, false);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return PlateColorChecker.getStartingPosition().equals("Center") || Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0) - startingValueLeft) > distanceToDrive && Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0) - startingValueRight) > distanceToDrive;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		firstRun = true;
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
