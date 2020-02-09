package per.vikram.creational.abstractFactory;
import per.vikram.creational.abstractFactory.Instance.Capacity;
public interface ResourceFactory {
    Instance createInstance(Capacity capacity);
    Storage createStorage();
}
