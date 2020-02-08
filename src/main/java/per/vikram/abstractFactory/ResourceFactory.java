package per.vikram.abstractFactory;
import per.vikram.abstractFactory.Instance.Capacity;
public interface ResourceFactory {
    Instance createInstance(Capacity capacity);
    Storage createStorage();
}
