
package frc.robot.Subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkClosedLoopController;
import com.ctre.phoenix6.swerve.SwerveModuleConstants;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkClosedLoopController;
import com.ctre.phoenix6.swerve.SwerveModuleConstants;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.spark.SparkBase.PersistMode;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkClosedLoopController;
import com.ctre.phoenix6.swerve.SwerveModuleConstants;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkBase.PersistMode;


public class Intake extends SubsystemBase{
    private SparkMax rotate1Motor = new SparkMax(Constants.RotateMotor1ID, MotorType.kBrushless);
    private SparkMax rotate2Motor = new SparkMax(Constants.RotateMotor2ID, MotorType.kBrushless);
    private SparkMax wheeleMotor = new SparkMax(Constants.WheelMotorID, MotorType.kBrushless);
    private RelativeEncoder IEncoder;

    private SparkClosedLoopController IpidController;
    private SparkMaxConfig config = new SparkMaxConfig();

    public Intake(){
        
        IpidController = wheeleMotor.getClosedLoopController();
        wheeleMotor.configure(config, com.revrobotics.spark.SparkBase.ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        config.closedLoop.pid(0, 0, 0);

    }

    public  void RotateIntakeForward () {
        SmartDashboard.putNumber("Intake", .5);
        rotate1Motor.set(0.5);
        rotate2Motor.set(0.5);
    }

    public  void RotateIntakeBackward ( ) {
        SmartDashboard.putNumber("Intake", -0.5);
        rotate1Motor.set(-0.5);
        rotate2Motor.set(0.5);
    }

    public  void IsetPostition1 () {
        IpidController.setReference(0, ControlType.kPosition);
    }
    public  void IsetPostition2 () {
        IpidController.setReference(0, ControlType.kPosition);
    }

    public  void RotateWheels ( ) {
        SmartDashboard.putNumber("IntakeWheels", .5);
        wheeleMotor.set(0.5);
    }  

    public  void RotateWheelsReverse ( ) {
        SmartDashboard.putNumber("IntakeWheels", -0.5);
        wheeleMotor.set(-0.5);
    }

    public void Stop ( ) {
        wheeleMotor.set(0);

        SmartDashboard.putNumber("Intake + IntakeWheels", 0);
    }


}
