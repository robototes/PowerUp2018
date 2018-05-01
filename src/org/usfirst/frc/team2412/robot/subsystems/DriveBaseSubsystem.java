package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends Subsystem {
	//DifferentialDrive for driving.
	private DifferentialDrive robotDrive = RobotMap.robotDrive;
	//TalonSRXs for driving.
	private WPI_TalonSRX talons[] = RobotMap.talons;
	
	//Gyroscope for turning.
	private GyroBase gyro = RobotMap.gyro;
	
	//TalonSRXs with encoders.
	private WPI_TalonSRX leftTalon = talons[2];
	private WPI_TalonSRX rightTalon = talons[3];
	
	//Initial encoder values.
	private double startingValueLeft = 0;
	private double startingValueRight = 0;
	
	public DriveBaseSubsystem() {
		leftTalon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		leftTalon.setSelectedSensorPosition(0, 0, 0);
		
		rightTalon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
		rightTalon.setSelectedSensorPosition(0, 0, 0);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}
	
	public void drive(Joystick stick) {
		robotDrive.arcadeDrive(stick.getY(), Math.pow(-stick.getTwist(), 3.0), true);
	}
	
	public void drive(double y, double x, boolean squaredInputs) {
		if(squaredInputs) {
			robotDrive.arcadeDrive(y, Math.pow(x, 3.0));
		} else {
			robotDrive.arcadeDrive(y, x);
		}
	}
	
	//Gyro-related functions.
	public double getAngle() {
		return gyro.getAngle();
	}
	
	public void resetAngle() {
		gyro.reset();
	}
	
	//Encoder-related functions.
	public double getRawLeftEncoderValue() {
		return leftTalon.getSelectedSensorPosition(0);
	}
	
	public double getLeftEncoderValue() {
		return getRawLeftEncoderValue() - startingValueLeft;
	}
	
	public void resetLeftEncoder() {
		startingValueLeft = getRawLeftEncoderValue();
	}
	
	public double getRawRightEncoderValue() {
		return rightTalon.getSelectedSensorPosition(0);
	}
	
	public double getRightEncoderValue() {
		return getRawRightEncoderValue() - startingValueRight;
	}
	
	public void resetRightEncoder() {
		startingValueRight = getRawRightEncoderValue();
	}
	
	public void setSideSpeeds(double leftSpeed, double rightSpeed) {
		robotDrive.setSafetyEnabled(false);
		
		talons[0].set(leftSpeed);
		talons[2].set(leftSpeed);
		talons[4].set(leftSpeed);
		
		talons[1].set(rightSpeed);
		talons[3].set(rightSpeed);
		talons[5].set(rightSpeed);
	}
}
