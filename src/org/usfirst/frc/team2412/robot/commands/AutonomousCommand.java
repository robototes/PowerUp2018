package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new DriveXFeetCommand());
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand());
		addSequential(new DriveLimitSwitchCommand());
	}
}
