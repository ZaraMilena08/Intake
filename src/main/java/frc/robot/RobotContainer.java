// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

import frc.robot.Subsystems.Intake;
import frc.robot.Commands.Intake.RotateIntakeBackward;
import frc.robot.Commands.Intake.RotateIntakeForward;
import frc.robot.Commands.Intake.RotateWheels;
import frc.robot.Commands.Intake.RotateWheelsReverse;
import frc.robot.Commands.Intake.Stop;
import frc.robot.Commands.Intake.IsetPostition1;
import frc.robot.Commands.Intake.IsetPostition2;


import frc.robot.Subsystems.Delivery;
import frc.robot.Commands.Delivery.RotatingArm;
import frc.robot.Commands.Delivery.DsetPostition1;
import frc.robot.Commands.Delivery.DsetPostition2;
import frc.robot.Commands.Delivery.DsetPostition3;
import frc.robot.Commands.Delivery.DsetPostition4;
import frc.robot.Commands.Delivery.DsetPostition5;


import frc.robot.Subsystems.Pneumatics;
import frc.robot.Commands.Pneumatics.RotatingArmGrab;
import frc.robot.Commands.Pneumatics.RotatingArmRelease;

public class RobotContainer {

  private CommandXboxController xboxController = new CommandXboxController(0);
  
  private Intake intake = new Intake();
  private Delivery delivery = new Delivery();
  private Pneumatics pneumatics = new Pneumatics();

  private RotateIntakeBackward RotateIntakeBackward = new RotateIntakeBackward(intake);
  private RotateIntakeForward RotateIntakeForward = new RotateIntakeForward(intake);
  private RotateWheels RotateWheels = new RotateWheels(intake);
  private RotateWheelsReverse RotateWheelsReverse = new RotateWheelsReverse(intake);
  private Stop Stop = new Stop(intake);
  private IsetPostition1 IsetPostition1 = new IsetPostition1(intake);
  private IsetPostition2 IsetPostition2 = new IsetPostition2(intake);

  private RotatingArm RotatingArm = new RotatingArm(delivery);
  private DsetPostition1 DsetPostition1 = new DsetPostition1(delivery);
  private DsetPostition2 DsetPostition2 = new DsetPostition2(delivery);
  private DsetPostition3 DsetPostition3 = new DsetPostition3(delivery);
  private DsetPostition4 DsetPostition4 = new DsetPostition4(delivery);
  private DsetPostition5 DsetPostition5 = new DsetPostition5(delivery);

  private RotatingArmRelease RotatingArmRelease = new RotatingArmRelease(pneumatics);
  private RotatingArmGrab RotatingArmGrab = new RotatingArmGrab(pneumatics);

  public RobotContainer() {

    intake.setDefaultCommand(Stop);

    configureBindings();
  }

  private void configureBindings() {

   //xboxController.a().onTrue(RotateIntakeForward);
    xboxController.a().whileTrue(RotateIntakeForward);

   //xboxController.a().onTrue(RotateWheels);
    xboxController.a().whileTrue(RotateWheels);

    //xboxController.a().onTrue(RotateIntakeBackward);
    xboxController.a().whileTrue(RotateIntakeBackward);


    //xboxController.a().onTrue(RotateWheelsReverse);
    xboxController.a().whileTrue(RotateWheelsReverse);

    //xboxController.a().onTrue(RotatingArmRelease);
    xboxController.a().whileTrue(RotatingArmRelease);

    //xboxController.a().onTrue(RotatingArmGrab);
    xboxController.a().whileTrue(RotatingArmGrab);

    //xboxController.a().onTrue(RotatingArm);
    xboxController.a().whileTrue(RotatingArm);

    //xboxController.a().onTrue(IsetPostition1);
    xboxController.a().whileTrue(IsetPostition1);

    //xboxController.a().onTrue(IsetPostition2);
    xboxController.a().whileTrue(IsetPostition2);

    //xboxController.a().onTrue(DsetPostition1);
    xboxController.a().whileTrue(DsetPostition1);

    //xboxController.a().onTrue(DsetPostition2);
    xboxController.a().whileTrue(DsetPostition2);

    //xboxController.a().onTrue(DsetPostition3);
    xboxController.a().whileTrue(DsetPostition3);

    //xboxController.a().onTrue(DsetPostition4);
    xboxController.a().whileTrue(DsetPostition4);

    //xboxController.a().onTrue(DsetPostition5);
    xboxController.a().whileTrue(DsetPostition5);
    
  }

  public Command getAutonomousCommand() {
  
    return Commands.print("No autonomous command configured");
  }
}
