/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;


/**
 * An example command.  You can replace me with your own command.
 */
public class DriveXFeetCommand extends CommandBase {
	private boolean firstRun = true;
	
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
		System.out.println("First run: " + firstRun);
		if(firstRun) {
			System.out.println(firstRun);
			RobotMap.talons[0].setSelectedSensorPosition(0, 0, 0);
			RobotMap.talons[1].setSelectedSensorPosition(0, 0, 0);
			firstRun = false;
			System.out.println(Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0)));
			System.out.println(Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0)));
		}
		System.out.println(Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0)));
		System.out.println(Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0)));
		driveBase.drive(0.5, 0, false);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return Math.abs(RobotMap.talons[0].getSelectedSensorPosition(0)) > 5000 && Math.abs(RobotMap.talons[1].getSelectedSensorPosition(0)) > 5000;
//		return -RobotMap.talons[0].getSelectedSensorPosition(0) > 1000 && RobotMap.talons[1].getSelectedSensorPosition(0) > 1000;
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
