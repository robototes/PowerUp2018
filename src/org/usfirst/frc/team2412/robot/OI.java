/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2412.robot;

import org.usfirst.frc.team2412.robot.commands.ClimbCommand;
import org.usfirst.frc.team2412.robot.commands.IntakeDown;
import org.usfirst.frc.team2412.robot.commands.IntakeUp;
import org.usfirst.frc.team2412.robot.commands.LiftDownCommand;
import org.usfirst.frc.team2412.robot.commands.LiftUpCommand;
import org.usfirst.frc.team2412.robot.commands.ShiftHighGearCommand;
import org.usfirst.frc.team2412.robot.commands.ShiftLowGearCommand;
import org.usfirst.frc.team2412.robot.commands.intakeClose;
import org.usfirst.frc.team2412.robot.commands.intakeIn;
import org.usfirst.frc.team2412.robot.commands.intakeOpen;
import org.usfirst.frc.team2412.robot.commands.intakeOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	public OI() {
		shiftHighButton.whenPressed(new ShiftHighGearCommand());
		shiftLowButton.whenPressed(new ShiftLowGearCommand());
		climbUpButton.whileHeld(new ClimbCommand());
		liftupbutton.whileHeld(new LiftUpCommand()); 
		liftdownbutton.whileHeld(new LiftDownCommand());
		buttonUp.whenPressed(new IntakeUp());
		buttonDown.whenPressed(new IntakeDown());
		buttonIn.whenPressed(new intakeIn());
		buttonOut.whenPressed(new intakeOut());
		buttonOpen.whenPressed(new intakeOpen());
		buttonClose.whenPressed(new intakeClose());
	}
	
	public Joystick stick = new Joystick(0);
	public Joystick codriver = new Joystick(1);
	
	public Button shiftHighButton = new JoystickButton(stick, 6);
	public Button shiftLowButton = new JoystickButton(stick, 3);
		
	public Button climbUpButton = new JoystickButton(codriver, 9);
	
	public Button liftupbutton = new JoystickButton(codriver,5);
	public Button liftdownbutton = new JoystickButton(codriver,6);
	
	public Button buttonUp = new JoystickButton(codriver, 1);
	public Button buttonDown = new JoystickButton(codriver, 2);
	public Button buttonIn = new JoystickButton(codriver, 3);
	public Button buttonOut = new JoystickButton(codriver, 4);
	public Button buttonOpen = new JoystickButton(codriver, 5);
	public Button buttonClose = new JoystickButton(codriver, 6);
}
