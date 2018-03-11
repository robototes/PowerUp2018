package org.usfirst.frc.team2412.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeUpDownSubsystem extends Subsystem {
//	private DoubleSolenoid upDown = RobotMap.upDown;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void intakeup()
	{
//		upDown.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeDown()
	{
//		upDown.set(DoubleSolenoid.Value.kReverse);
	}

}
