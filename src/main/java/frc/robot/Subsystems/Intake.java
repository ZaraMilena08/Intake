
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


public class Intake extends SubsystemBase{
    private SparkMax rotate1Motor = new SparkMax(Constants.RotateMotor1ID, MotorType.kBrushless);
    private SparkMax rotate2Motor = new SparkMax(Constants.RotateMotor2ID, MotorType.kBrushless);
    private SparkMax wheeleMotor = new SparkMax(Constants.WheelMotorID, MotorType.kBrushless);
    private SparkMaxConfig m_config = new SparkMaxConfig();
    private RelativeEncoder IEncoder;
    private SparkClosedLoopController IpidController;

    public Intake(){

        IEncoder = wheeleMotor.getEncoder();
        PIDController pid2 = new PIDController(0, 0, 0);

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
        IEncoder.setPosition(0);
    }
    public  void IsetPostition2 () {
        IEncoder.setPosition(0);
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
