package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.DriveForwardCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoNoCubeCommand extends CommandGroup {
	public AutoNoCubeCommand() {
		addSequential(new DriveForwardCommand(170000, 0, 7, 0.0000045, 0.000000083, 0.0000001));
//		addSequential(new WaitCommand(1));
//		addSequential(new TurnCommand(90));
//		addSequential(new EncoderCommand(-0.5, 200000, 90));
	}
}
