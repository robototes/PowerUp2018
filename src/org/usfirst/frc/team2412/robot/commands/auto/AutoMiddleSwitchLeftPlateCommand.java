package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.DriveForwardCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMiddleSwitchLeftPlateCommand extends CommandGroup {
	public AutoMiddleSwitchLeftPlateCommand() {
		addSequential(new DriveForwardCommand(30000, 0, 10, 0.00002, 0.000001, 0.0000001));
		addSequential(new WaitCommand(0.3));
		addSequential(new TurnCommand(-60, 1.0, 0.01));
		addSequential(new DriveForwardCommand(220000, -60, 10, 0.000002, 0.00000005, 0.0000001));
		addSequential(new WaitCommand(0.3));
		addSequential(new TurnCommand(0, 0.9, 0.01));
		addSequential(new WaitCommand(0.3));
		addSequential(new DriveForwardCommand(27000, 0, 10, 0.00005, 0.000000, 0.0000001));
		addSequential(new DropCubeCommand());
		/*
		addSequential(new ShiftLowGearCommand());
		addSequential(new EncoderCommand(-0.7, 20000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(-90));
		addSequential(new EncoderCommand(-0.7, 70000, -90));
//		addSequential(new EncoderCommand(-0.5, 70000, 30000, 30000, 90));
		
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0));
		addSequential(new TimedEncoderCommand(-0.7, 90000, 0, 2, 5E9));
		addSequential(new DropCubeCommand());
		*/
	}
}
