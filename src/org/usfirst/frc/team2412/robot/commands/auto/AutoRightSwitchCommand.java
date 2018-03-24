package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRightSwitchCommand extends CommandGroup {
	public AutoRightSwitchCommand() {
		addSequential(new EncoderCommand(-0.7, 200000)); //Right-center is 120000
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(-90));
		addSequential(new EncoderCommand(-0.7, 40000, -90));
		//addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
	}
}
