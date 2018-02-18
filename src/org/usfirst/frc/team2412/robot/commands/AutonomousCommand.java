package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new DriveXFeetCommand(0.5, 230000, 120000, 190000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveStage3Command(0.5, 14000, 14000, 14000, -90));
//		addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
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
