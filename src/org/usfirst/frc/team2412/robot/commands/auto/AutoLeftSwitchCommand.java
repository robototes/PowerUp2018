package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.DriveForwardCommand;
import org.usfirst.frc.team2412.robot.commands.TurnCommand;
import org.usfirst.frc.team2412.robot.commands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoLeftSwitchCommand extends CommandGroup {
	public AutoLeftSwitchCommand() {
		addSequential(new DriveForwardCommand(240000, 0, 5, 0.0000025, 0.00000004, 0.0000001));
		addSequential(new WaitCommand(0.5));
		addSequential(new TurnCommand(90, 0.9, 0.015));
		addSequential(new DriveForwardCommand(30000, 90, 10, 0.000002, 0.00000005, 0.0000001));
		addSequential(new DropCubeCommand());
//		addSequential(new EncoderCommand(-0.5, 200000)); //Right-center is 120000
//		addSequential(new WaitCommand(1));
//		addSequential(new TurnCommand());
//		addSequential(new TimedEncoderCommand(-0.5, 14000, -90, 2, 5E9));
//		//addSequential(new DriveLimitSwitchCommand());
//		addSequential(new DropCubeCommand());
	}
}
