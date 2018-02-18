package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		
		
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new DriveXFeetCommand(0.5, 460000, 120000, 460000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(80));
//		addSequential(new IntakeDown());
//		addSequential(new WaitCommand(1));
//		addSequential(new DriveStage3Comlmand(0.5, 30000, 30000, 30000, -90));
//		addSequential(new DriveLimitSwitchCommand());
//		addSequential(new DropCubeCommand());
		
		
		/*
		addSequential(new DriveStage3Command(-0.5, 14000, 14000, 14000, -90));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0));
		addSequential(new EncoderCommand(0.5, 60000, 60000, 60000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90));
		addSequential(new EncoderCommand(0.5, 60000, 60000, 60000, -90));
		
		/*
		addSequential(new AutoIntakeOpenCommand());
		addSequential(new WaitCommand(1.25));
		addSequential(new EncoderCommand(0.5, 2500, 2500, 2500));
		addSequential(new WaitCommand(0.5));
		addSequential(new IntakeCubeAutoCommand());
//		addSequential(new EncoderCommand(-0.5, 2000, 2000, 2000));
		addSequential(new AutoIntakeInCommand());
		addSequential(new IntakeUp());
		addSequential(new WaitCommand(2));
		addSequential(new EncoderCommand(0.5, 4000, 4000, 4000, 10));
		addSequential(new intakeOut());
		*/
	}
}
