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
	
	public void spinWheelsIn()
	{
		left.set(1.0);
		right.set(-1.0);	
	}
	
	public void spinWheelsOut()
	{
		left.set(-1.0);
		right.set(1.0);
	}
	
	public void intakeOpen()
	{
		topRightC.set(DoubleSolenoid.Value.kForward);
		topLeftC.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeClose()
	{
		topRightC.set(DoubleSolenoid.Value.kReverse);
		topLeftC.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void intakeup()
	{
		bottomRightC.set(DoubleSolenoid.Value.kForward);
		bottomLeftC.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeDown()
	{
		bottomRightC.set(DoubleSolenoid.Value.kReverse);
		bottomLeftC.set(DoubleSolenoid.Value.kReverse);
	}

	protected void initDefaultCommand() 
	{
		

	}

}
