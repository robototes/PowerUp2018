package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.LiftSteadyCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LiftSubsystem extends Subsystem{
	
	private WPI_TalonSRX liftmotor1 = RobotMap.liftmoter1;
	private WPI_TalonSRX liftmotor2 = RobotMap.liftmoter2;
	
	public void liftup() {
		liftmotor1.set(-0.85);	
		liftmotor2.set(-0.85);
	}
	public void liftdown() {
		liftmotor1.set(0.3);	
		liftmotor2.set(0.3);
	}
	public void holdsteady() {
		liftmotor1.set(0);
		liftmotor2.set(0);
	}
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftSteadyCommand());
		
		
	} 

}