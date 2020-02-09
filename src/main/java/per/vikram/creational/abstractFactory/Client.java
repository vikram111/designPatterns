package per.vikram.creational.abstractFactory;

public class Client {
    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory){
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity){
        Instance instance = new Ec2Instance(Instance.Capacity.large);
        Storage storage = new S3Storage();
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance instance = client.createServer(Instance.Capacity.large);
        instance.start();
        instance.stop();

    }
}
