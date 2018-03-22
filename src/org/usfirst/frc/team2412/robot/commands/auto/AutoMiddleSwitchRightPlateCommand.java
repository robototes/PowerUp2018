package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;
import org.usfirst.frc.team2412.robot.commands.ShiftLowGearCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoMiddleSwitchRightPlateCommand extends CommandGroup {
	public AutoMiddleSwitchRightPlateCommand() {
		addSequential(new ShiftLowGearCommand());
		addSequential(new EncoderCommand(-0.7, 20000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90, 1, 0.0095));
		addSequential(new EncoderCommand(-0.7, 50000, 90));
//		addSequential(new EncoderCommand(-0.5, 70000, 30000, 30000, 90));
		
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0, 1, 0.009));
		addSequential(new EncoderCommand(-0.7, 90000));
		addSequential(new DropCubeCommand());
	}
}
