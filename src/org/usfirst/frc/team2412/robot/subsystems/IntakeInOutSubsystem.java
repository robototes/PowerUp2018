package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeInOutSubsystem extends Subsystem {
	
	private WPI_TalonSRX left = RobotMap.left;
	private WPI_TalonSRX right = RobotMap.right;
	
	public void spinWheelsIn()
	{
		left.set(-1.0);
		right.set(1.0);	
	}
	
	public void spinWheelsOut()
	{
		left.set(1.0);
		right.set(-1.0);
	}
	
	public void stopWheels() {
		left.set(0.0);
		right.set(0.0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
