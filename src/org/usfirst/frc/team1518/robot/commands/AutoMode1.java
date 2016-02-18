package org.usfirst.frc.team1518.robot.commands;


import org.usfirst.frc.team1518.robot.Robot;
import org.usfirst.frc.team1518.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.*;

public class AutoMode1 extends Command {

	boolean taskComplete = false;

	public AutoMode1() {
	    requires(Robot.driveTrain);
		// addSequential(new Forward( ));
	 
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		int timeout = 0;
		
		while (timeout < 250000) {
			Robot.driveTrain.drive(-.5, -.5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		timeout = 0;
		while (timeout < 250000) {
			Robot.driveTrain.drive(-.5, .5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		timeout = 0;
		while (timeout <250000) {
			Robot.driveTrain.drive(-.5, -.5);
			timeout = timeout + 1;
		}
		Robot.driveTrain.drive(0, 0);
		
		taskComplete = true;
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return taskComplete;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.driveTrain.drive(0, 0);

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}
}
