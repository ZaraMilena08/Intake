
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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkBase.PersistMode;


public class Delivery extends SubsystemBase{

    private RelativeEncoder DEncoder;
    private SparkClosedLoopController DpidController;

    private SparkMax RotateArmMoterID = new SparkMax(Constants.RotateArmMoterID, MotorType.kBrushless);
    
    private SparkMaxConfig config = new SparkMaxConfig();

    public Delivery(){

    DpidController = RotateArmMoterID.getClosedLoopController();
    RotateArmMoterID.configure(config, com.revrobotics.spark.SparkBase.ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    config.closedLoop.pid(0, 0, 0);


    }

    public  void RotatingArm ( ) {
        RotateArmMoterID.set(0.5);
        SmartDashboard.putNumber("RotatingArm", 0.5);
    }

    public  void DsetPostition1 () {
        DpidController.setReference(0, ControlType.kPosition);
    }
    public  void DsetPostition2 () {
        DpidController.setReference(0, ControlType.kPosition);
    }
    public  void DsetPostition3 () {
        DpidController.setReference(0, ControlType.kPosition);
    }    
    public  void DsetPostition4 () {
        DpidController.setReference(0, ControlType.kPosition);
    }
    public  void DsetPostition5 () {
        DpidController.setReference(0, ControlType.kPosition);
    }

      public void Stop ( ) {
        RotateArmMoterID.set(0);
        SmartDashboard.putNumber("RotatingArm", 0);
    }
}
