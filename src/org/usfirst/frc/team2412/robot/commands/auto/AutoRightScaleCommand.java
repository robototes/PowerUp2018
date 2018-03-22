package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;
import org.usfirst.frc.team2412.robot.commands.IntakeDown;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRightScaleCommand extends CommandGroup {
	public AutoRightScaleCommand() {
		addSequential(new EncoderCommand(-0.7, 400000, 0, 4));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(-45, 1.5, 0.02));
		addSequential(new LiftUpLimitSwitchCommand());
		addSequential(new DropCubeCommand());
		/*
		addSequential(new IntakeDown()); //TODO COMMENT OUT THIS LINE WHEN WE'RE AT SAMMAMISH
		addSequential(new EncoderCommand(-0.2, 20000, 90));
		*/
	}
}
