package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.EncoderCommand;
import org.usfirst.frc.team2412.robot.commands.IntakeDown;
import org.usfirst.frc.team2412.robot.commands.TimedEncoderCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeftScaleCommand extends CommandGroup {
	public AutoLeftScaleCommand() {
//		addSequential(new ShiftHighGearCommand());
		addSequential(new EncoderCommand(-0.5, 460000, -2));
//		addSequential(new ShiftLowGearCommand());
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(-80));
		addSequential(new IntakeDown()); //TODO COMMENT OUT THIS LINE WHEN WE'RE AT SAMMAMISH
		addSequential(new LiftUpLimitSwitchCommand());
		addSequential(new TimedEncoderCommand(-0.2, 15000, -90, 2, 5E9));
		addSequential(new DropCubeCommand());
	}
}
