package org.usfirst.frc.team2412.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.SensorBase;
import edu.wpi.first.wpilibj.smartdashboard.SendableBuilder;

public class MaxBotixSonar extends SensorBase {

	private AnalogInput channel;
	private static final double RAW_TO_INCHES = 1.0 / 0.0091;
	public MaxBotixSonar(int port) {
		channel = new AnalogInput(port);
	}

	@Override
	public void initSendable(SendableBuilder builder) {
	}

	public double getRawDistance() {
		return channel.getVoltage();
	}
	
	public double getInches() {
		return getRawDistance() * RAW_TO_INCHES;
	}
	public void free() {
		channel.free();
	}
}
