package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.DriveForwardCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMiddleSwitchRightPlateCommand extends CommandGroup {
	public AutoMiddleSwitchRightPlateCommand() {
		addSequential(new DriveForwardCommand(170000, 0, 2, 0.0000045, 0.000000083, 0.0000001)); //Try this first. If it doesn't work, see below:
		addSequential(new DropCubeCommand());
		/*
		addSequential(new ShiftLowGearCommand());
		addSequential(new EncoderCommand(-0.7, 20000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90, 1, 0.0095));
		addSequential(new EncoderCommand(-0.7, 40000, 90));
//		addSequential(new EncoderCommand(-0.5, 70000, 30000, 30000, 90));
		
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0, 1, 0.009));
		addSequential(new TimedEncoderCommand(-0.7, 90000, 0, 2, 5E9));
		addSequential(new DropCubeCommand());
		*/
	}
}
