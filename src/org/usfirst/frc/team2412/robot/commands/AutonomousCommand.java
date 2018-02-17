package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.PlateColorChecker;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
		addSequential(new DriveXFeetCommand(230000, 120000, 190000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveStage3Command(14000, 14000, 14000, -90));
//		addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
	}
}
