package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new EncoderCommand(0.2, 4737, 120000, 190000));
		addSequential(new IntakeCubeAutoCommand());
		/*
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new DriveXFeetCommand(0.5, 230000, 120000, 190000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveStage3Command(0.5, 14000, 14000, 14000, -90));
//		addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
		*/
	}
}
