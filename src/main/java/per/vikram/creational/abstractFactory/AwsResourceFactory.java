package per.vikram.creational.abstractFactory;

public class AwsResourceFactory implements ResourceFactory {

    private Instance instance;
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        if(instance == null){
            instance = new Ec2Instance(capacity);
        }
        return instance;

    }

    @Override
    public Storage createStorage() {
        return new S3Storage();
    }
}
