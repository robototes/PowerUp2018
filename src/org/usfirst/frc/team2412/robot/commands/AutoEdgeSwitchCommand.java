package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoEdgeSwitchCommand extends CommandGroup {
	public AutoEdgeSwitchCommand() {
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new EncoderCommand(0.5, 120000)); //Right-center is 120000
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new EncoderCommand(0.5, 14000, -90));
		//addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
	}
}
