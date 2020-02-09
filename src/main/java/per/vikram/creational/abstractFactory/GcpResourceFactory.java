package per.vikram.creational.abstractFactory;

public class GcpResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GcpInstance(capacity);
    }

    @Override
    public Storage createStorage() {
        return new GcpStorage();
    }
}
