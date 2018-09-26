package org.usfirst.frc.team2412.robot.commands;

public class DriveForwardCommand extends CommandBase {
	// Distance to drive (encoder units).
	private double distanceToDrive = 0;
	
	// Heading to maintain while driving (degrees).
	private double angleToTurn = 0;
	
	// P for turning.
	private double Tp = 2;
	
	// PID constants for driving.
	private double p = 1;
	private double i = 0;
	private double d = 0;
	
	// If we need to override the default PID constants.
	private boolean overridePIDConstants = false;
	
	public DriveForwardCommand(double driveDistance) {
		this(driveDistance, 0, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle) {
		this(driveDistance, angle, 2);
	}
	
	public DriveForwardCommand(double driveDistance, double angle, double Tp) {
		requires(driveBase);
		this.distanceToDrive = driveDistance;
		this.angleToTurn = angle;
		this.Tp = Tp;
	}
	
	public DriveForwardCommand(double driveDistance, double angle, double Tp, double p, double i, double d) {
		this(driveDistance, angle, Tp);
		this.p = p;
		this.i = i;
		this.d = d;
		overridePIDConstants = true;
	}
	
	// Called when the command first runs.
	@Override
	protected void initialize() {
		driveBase.setInputRange(0, distanceToDrive);
		driveBase.setSetpoint(distanceToDrive);
		driveBase.setAbsoluteTolerance(2500);
		
		if(overridePIDConstants) {
			driveBase.getPIDController().setPID(p, i, d);
		}
		driveBase.resetLeftEncoder();
		driveBase.resetRightEncoder();
		
		driveBase.getPIDController().enable();
		driveBase.setTurnAngle(angleToTurn);

		driveBase.setTp(Tp);
	}
	
	// Called repeatedly when this Command is scheduled to run.
	@Override
	protected void execute() {
		System.out.println("RUNNING ENCODERCOMMAND");
		System.out.println("DRIVING TO: " + distanceToDrive);
		System.out.println("POSITION: " + driveBase.returnPIDInput());
		System.out.println("ERROR: " + driveBase.getPIDController().getError());
		System.out.println("P: " + driveBase.getPIDController().getP());
		System.out.println("CALCULATED VALUE: " + driveBase.getPIDController().get());
	}
	
	// Determines when the command will exit.
	@Override
	protected boolean isFinished() {
		return driveBase.onTarget();
	}
	
	// Called when the command ends.
	@Override
	protected void end() {
		driveBase.disable();
		System.out.println("End");
	}
}
