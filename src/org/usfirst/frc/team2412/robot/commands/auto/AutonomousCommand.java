package org.usfirst.frc.team2412.robot.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup {
	public AutonomousCommand() {
		addSequential(new AutoLeftSwitchCommand());
		/**
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0, 1.0, 0.01));
		addSequential(new DriveForwardCommand(70000, 0, 2, 0.00001, 0.00000005, 0.0000001));
		
		*/
		
//		addSequential(new WaitCommand(1));
//		addSequential(new TurnCommand(90, 1.0, 0.01));
		
		//addSequential(new FollowTrajectoryCommand("Drive Forward 10 Feet", 4));
		
//		addSequential(new WaitCommand(PlateColorChecker.getTimeToWait()));
//		if(PlateColorChecker.getStartingPosition().equals("Left")) {
//			if(PlateColorChecker.isLeftSwitchCorrectColor()) {
//				addSequential(new AutoLeftSwitchCommand());
//			} /*else if(PlateColorChecker.isLeftScaleCorrectColor()) {
//				addSequential(new AutoLeftScaleCommand());
//			} */else {
//				addSequential(new AutoLeftNoCubeCommand());
//			}
//		} else if(PlateColorChecker.getStartingPosition().equals("Right")) {
//			if(PlateColorChecker.isRightSwitchCorrectColor()) {
//				addSequential(new AutoRightSwitchCommand());
//			} /*else if(PlateColorChecker.isRightScaleCorrectColor()) {
//				addSequential(new AutoRightScaleCommand());
//			} */else {
//				addSequential(new AutoRightNoCubeCommand());
//			}
//		} else if(PlateColorChecker.getStartingPosition().equals("Middle")) {
//			if(PlateColorChecker.isLeftSwitchCorrectColor()) {
//				addSequential(new AutoMiddleSwitchLeftPlateCommand());
//			} else if(PlateColorChecker.isRightSwitchCorrectColor()) {
//				addSequential(new AutoMiddleSwitchRightPlateCommand());
//			}
//		} else {
//			addSequential(new EncoderCommand(-0.5, 200000));
//		}
		/*
		
//		addSequential(new IntakeDown());
//		addSequential(new WaitCommand(1));
//		addSequential(new DriveStage3Command(0.5, 30000, 30000, 30000, -90));
//		addSequential(new DriveLimitSwitchCommand());
//		addSequential(new DropCubeCommand());
		
		/*
		addSequential(new DriveStage3Command(-0.5, 14000, 14000, 14000, -90));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(0));
		addSequential(new EncoderCommand(0.5, 60000, 60000, 60000));
		addSequential(new WaitCommand(1));
		addSequential(new TurnCommand(90));
		addSequential(new EncoderCommand(0.5, 60000, 60000, 60000, -90));
		
		/*
		addSequential(new AutoIntakeOpenCommand());
		addSequential(new WaitCommand(1.25));
		addSequential(new EncoderCommand(0.5, 2500, 2500, 2500));
		addSequential(new WaitCommand(0.5));
		addSequential(new IntakeCubeAutoCommand());
//		addSequential(new EncoderCommand(-0.5, 2000, 2000, 2000));
		addSequential(new AutoIntakeInCommand());
		addSequential(new IntakeUp());
		addSequential(new WaitCommand(2));
		addSequential(new EncoderCommand(0.5, 4000, 4000, 4000, 10));
		addSequential(new intakeOut());
		*/
	}
}
