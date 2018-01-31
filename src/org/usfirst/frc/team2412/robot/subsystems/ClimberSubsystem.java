package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ClimberSubsystem extends Subsystem {
private WPI_TalonSRX[] climbermotors = RobotMap.climberstalons;
	

 @Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
public void climb() {
	climbermotors[0].set(1);
    climbermotors[1].set(1);
}
}
