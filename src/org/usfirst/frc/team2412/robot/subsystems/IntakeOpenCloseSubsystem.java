package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class IntakeOpenCloseSubsystem extends Subsystem {
	private DoubleSolenoid openClose = RobotMap.openClose;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void intakeOpen()
	{
		openClose.set(DoubleSolenoid.Value.kForward);
	}
	
	public void intakeClose()
	{
		openClose.set(DoubleSolenoid.Value.kReverse);
	}
	
}
