package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.ClimberSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseShifterSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeInOutSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeOpenCloseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeUpDownSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.LiftSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	//Intake Subsystems --
	public static IntakeUpDownSubsystem intakeUpDown = new IntakeUpDownSubsystem();
	public static IntakeOpenCloseSubsystem intakeOpenClose = new IntakeOpenCloseSubsystem();
	public static IntakeInOutSubsystem intakeInOut = new IntakeInOutSubsystem();
	
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static DriveBaseShifterSubsystem driveShifters = new DriveBaseShifterSubsystem();
	public static ClimberSubsystem climber = new ClimberSubsystem();
	public static LiftSubsystem lift = new LiftSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}


}
