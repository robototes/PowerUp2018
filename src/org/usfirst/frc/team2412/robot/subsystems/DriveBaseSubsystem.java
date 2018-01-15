package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends Subsystem {
	//DifferentialDrive for driving.
	private DifferentialDrive robotDrive = RobotMap.robotDrive;
	
	public DriveBaseSubsystem() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}
	
	public void drive(Joystick stick) {
		robotDrive.arcadeDrive(-stick.getY(), stick.getTwist(), true);
	}

}
