
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


public class Delivery extends SubsystemBase{

    private RelativeEncoder DEncoder;
    private SparkClosedLoopController DpidController;

    private SparkMax RotateArmMoterID = new SparkMax(Constants.RotateArmMoterID, MotorType.kBrushless);
    
    private SparkMaxConfig m_config = new SparkMaxConfig();

    public Delivery(){


    DEncoder = RotateArmMoterID.getEncoder();
  
    PIDController pid2 = new PIDController(0, 0, 0);


    }

    public  void RotatingArm ( ) {
        RotateArmMoterID.set(0.5);
        SmartDashboard.putNumber("RotatingArm", 0.5);
    }

    public  void DsetPostition1 () {
        DEncoder.setPosition(0);
    }
    public  void DsetPostition2 () {
        DEncoder.setPosition(0);
    }
    public  void DsetPostition3 () {
        DEncoder.setPosition(0);
    }    
    public  void DsetPostition4 () {
        DEncoder.setPosition(0);
    }
    public  void DsetPostition5 () {
        DEncoder.setPosition(0);
    }

      public void Stop ( ) {
        RotateArmMoterID.set(0);
        SmartDashboard.putNumber("RotatingArm", 0);
    }
}
