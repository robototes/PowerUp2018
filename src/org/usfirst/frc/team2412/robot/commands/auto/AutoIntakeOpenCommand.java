package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.IntakeDown;
import org.usfirst.frc.team2412.robot.commands.intakeOpen;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoIntakeOpenCommand extends CommandGroup {
	public AutoIntakeOpenCommand() {
		addSequential(new intakeOpen());
		addSequential(new IntakeDown());
	}
}
