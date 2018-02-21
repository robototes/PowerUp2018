package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoScaleCommand extends CommandGroup {
	public AutoScaleCommand() {
		addSequential(new ShiftHighGearCommand());
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new EncoderCommand(0.8, 460000, -2));
		addSequential(new ShiftLowGearCommand());
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(80));
		addSequential(new IntakeDown()); //TODO COMMENT OUT THIS LINE WHEN WE'RE AT SAMMAMISH
		addSequential(new LiftUpLimitSwitchCommand());
		addSequential(new EncoderCommand(0.2, 20000, 90)); //Left is 15000.
		addSequential(new DropCubeCommand());
	}
}
