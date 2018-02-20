package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.ShiftLowGearCommand;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBaseShifterSubsystem extends Subsystem {
	//DoubleSolenoid for shifting.
	private DoubleSolenoid shifter = RobotMap.shifter;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ShiftLowGearCommand());
	}

	public void shiftHighGear() {
		shifter.set(Value.kForward);
	}
	
	public void shiftLowGear() {
		shifter.set(Value.kReverse);
	}
}
