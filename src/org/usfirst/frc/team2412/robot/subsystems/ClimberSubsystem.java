package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.ClimbSteadyCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimberSubsystem extends Subsystem {
private WPI_TalonSRX[] climbermotors = RobotMap.climberstalons;
	

 @Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ClimbSteadyCommand());
	}
public void climbUp() {
	climbermotors[0].set(-1);
    climbermotors[1].set(-1);
}
public void climbDown() {
	climbermotors[0].set(1);
	climbermotors[1].set(1);
}
public void stopClimb() {
	climbermotors[0].set(0);
	climbermotors[1].set(0);
}
}
