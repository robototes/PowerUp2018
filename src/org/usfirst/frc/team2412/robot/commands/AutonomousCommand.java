package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new DriveXFeetCommand(35000, 20000, 35000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveStage3Command(1000, 20000, 1000, 90));
//		addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
	}
}
