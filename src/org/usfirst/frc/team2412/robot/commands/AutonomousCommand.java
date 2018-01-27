package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new DriveXFeetCommand(35000, 30000, 35000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveStage3Command(1000, 30000, 1000));
//		addSequential(new DriveLimitSwitchCommand());
		addSequential(new DropCubeCommand());
	}
}
