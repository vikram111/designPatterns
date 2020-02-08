package per.vikram.abstractFactory;

public class GcpInstance implements Instance {

    public GcpInstance(Capacity capacity){
        System.out.println("GCP Instance allocated with capacity "+capacity);
    }
    @Override
    public void start() {
        System.out.println("gcp compute started");
    }

    @Override
    public void stop() {
        System.out.println("gcp compute stopped");
    }

}
