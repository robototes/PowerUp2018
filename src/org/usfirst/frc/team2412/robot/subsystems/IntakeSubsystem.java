package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeSubsystem extends Subsystem 
{
	private DigitalInput limitSwitch = RobotMap.limitSwitch;
	
	private DoubleSolenoid topRightC = RobotMap.topRightC;
	private DoubleSolenoid topLeftC = RobotMap.topLeftC;
	private DoubleSolenoid bottomRightC = RobotMap.bottomRightC;
	private DoubleSolenoid bottomLeftC = RobotMap.bottomLeftC;
	
	private WPI_TalonSRX left = RobotMap.left;
	private WPI_TalonSRX right = RobotMap.right;

	protected void initDefaultCommand() 
	{
		

	}

}
