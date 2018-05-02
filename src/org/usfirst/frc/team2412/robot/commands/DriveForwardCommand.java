package org.usfirst.frc.team2412.robot.commands;

public class DriveForwardCommand extends CommandBase {
	// Distance to drive (encoder units).
	private double distanceToDrive = 0;
	
	// Heading to maintain while driving (degrees).
	private double angleToTurn = 0;
	
	// P for turning.
	private double Tp = 2;
	
	public DriveForwardCommand(double driveDistance) {
		this(driveDistance, 0, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle) {
		this(driveDistance, angle, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle, double Tp) {
		this.distanceToDrive = driveDistance;
		this.angleToTurn = angle;
		this.Tp = Tp;
	}
	
	// Called when the command first runs.
	@Override
	protected void initialize() {
		driveBase.setInputRange(0, distanceToDrive);
		driveBase.setSetpoint(distanceToDrive);
		driveBase.getPIDController().enable();
		driveBase.setTurnAngle(angleToTurn);
		driveBase.resetLeftEncoder();
		driveBase.resetRightEncoder();
		driveBase.setTp(Tp);
	}
	
	// Called repeatedly when this Command is scheduled to run.
	@Override
	protected void execute() {
		System.out.println("RUNNING ENCODERCOMMAND");
		System.out.println("DRIVING TO: " + distanceToDrive);
		System.out.println("POSITION: " + driveBase.returnPIDInput());
		System.out.println("ERROR: " + driveBase.getPIDController().getError());
		System.out.println("CALCULATED VALUE: " + driveBase.getPIDController().getError());
	}
}
