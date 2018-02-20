package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMiddleSwitchCommand extends CommandGroup {
	public AutoMiddleSwitchCommand() {
		addSequential(new ShiftLowGearCommand());
		addSequential(new EncoderCommand(-0.5, 20000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90));
		addSequential(new EncoderCommand(-0.5, 70000, 90));
//		addSequential(new EncoderCommand(-0.5, 70000, 30000, 30000, 90));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0));
		addSequential(new EncoderCommand(-0.5, 110000));
		addSequential(new DropCubeCommand());
	}
}
