/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	
	
	/** WPI_TalonSRX IDs */
	
	public static int[] motorIDs = new int[] {
		//    FRONT   //
		// -----------//
		3, /*        */9,
		// -----------//
		// -----------//
		10, /*       */5,
		// -----------//
		// -----------//
		2, /*        */1,
		// -----------//
		//     BACK   //
		// [value] [description]
		// 3 front-left
		// 10 middle-left (has encoder)
		// 2 back-left
		// 9 front-right
		// 5 middle-right (has encoder)
		// 1 back-right
	};
	
	/** WPI_TalonSRX instances */
	public static WPI_TalonSRX[] talons = new WPI_TalonSRX[]{
		new WPI_TalonSRX(motorIDs[0]),
		new WPI_TalonSRX(motorIDs[1]),
		new WPI_TalonSRX(motorIDs[2]),
		new WPI_TalonSRX(motorIDs[3]),
		new WPI_TalonSRX(motorIDs[4]),
		new WPI_TalonSRX(motorIDs[5])
	};
	/*
	public static int liftmoterID1 = 0;
	public static int liftmoterID2 = 6;
	
	public static WPI_TalonSRX liftmoter1 = new WPI_TalonSRX(liftmoterID1);
	public static WPI_TalonSRX liftmoter2 = new WPI_TalonSRX(liftmoterID2);
	
	public static int [] climbermotorIDs = new int[] {
		11, 7
		};
	
	public static WPI_TalonSRX[] climberstalons = new WPI_TalonSRX[] {
			new WPI_TalonSRX(climbermotorIDs[0]),
			new WPI_TalonSRX(climbermotorIDs[1])
	};
	*/
	/** SpeedControllerGroup instances */
	public static SpeedControllerGroup leftSide = new SpeedControllerGroup(talons[0], talons[2], talons[4]);
	public static SpeedControllerGroup rightSide = new SpeedControllerGroup(talons[1], talons[3], talons[5]);
	
	/** DifferentialDrive instance */
	public static DifferentialDrive robotDrive = new DifferentialDrive(leftSide, rightSide);
	
	/** Gyroscope */
	public static GyroBase gyro = new ADXRS450_Gyro();
	
	/** Limit switch */
	public static DigitalInput limitSwitch = new DigitalInput(0);
	
	/** DoubleSolenoid IDs */
	public static int shifterID = 1;
	public static int shifterIDReverse = 2;
	
	/** DoubleSolenoid for shifting gearboxes */
	//public static DoubleSolenoid shifter = new DoubleSolenoid(shifterID, shifterIDReverse);
}
