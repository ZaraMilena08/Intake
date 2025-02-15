package frc.robot.Commands.Delivery;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Delivery;

public class DsetPostition1 extends Command  {


    private Delivery delivery;

    public DsetPostition1 (Delivery delivery){
        this.delivery = delivery;
        addRequirements(delivery);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        delivery.DsetPostition1();
    }
    


}
