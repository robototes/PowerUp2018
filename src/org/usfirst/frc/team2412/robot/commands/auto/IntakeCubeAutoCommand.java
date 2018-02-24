package org.usfirst.frc.team2412.robot.commands.auto;

import org.usfirst.frc.team2412.robot.commands.intakeClose;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class IntakeCubeAutoCommand extends CommandGroup {
	public IntakeCubeAutoCommand() {
		addSequential(new intakeClose());
		addSequential(new AutoIntakeInCommand());
	}
}
