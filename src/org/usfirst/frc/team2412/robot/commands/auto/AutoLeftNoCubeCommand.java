package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeftNoCubeCommand extends CommandGroup {
	public AutoLeftNoCubeCommand() {
		addSequential(new EncoderCommand(-0.5, 200000)); //TODO check distances.
//		addSequential(new WaitCommand(1));
//		addSequential(new TurnCommand());
//		addSequential(new EncoderCommand(-0.5, 200000, -90));
	}
}
