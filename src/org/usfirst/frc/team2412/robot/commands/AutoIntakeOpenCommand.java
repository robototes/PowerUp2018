package org.usfirst.frc.team2412.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoIntakeOpenCommand extends CommandGroup {
	public AutoIntakeOpenCommand() {
		addSequential(new intakeOpen());
		addSequential(new IntakeDown());
	}
}
