package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeSubsystem extends Subsystem 
{
	private DigitalInput limitSwitch = RobotMap.limitSwitch;
	private DoubleSolenoid upDown = RobotMap.upDown;
	private DoubleSolenoid openClose = RobotMap.openClose;
	
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
	
	public void stopWheels() {
		left.set(0.0);
		right.set(0.0);
	}
	
	public void intakeup()
	{
		upDown.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeDown()
	{
		upDown.set(DoubleSolenoid.Value.kReverse);
	}


	public void intakeOpen()
	{
		openClose.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeClose()
	{
		openClose.set(DoubleSolenoid.Value.kReverse);
	}
	
	protected void initDefaultCommand() 
	{
		

	}

}
