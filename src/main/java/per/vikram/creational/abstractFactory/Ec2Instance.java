package per.vikram.creational.abstractFactory;

public class Ec2Instance implements Instance {

    public Ec2Instance(Capacity capacity){
        System.out.println("Ec2 instance with capacity "+capacity);
    }
    @Override
    public void start() {
        System.out.println("Ec2 Instance started");
    }

    @Override
    public void stop() {
        System.out.println("EC2 Instance stopped");
    }

}
