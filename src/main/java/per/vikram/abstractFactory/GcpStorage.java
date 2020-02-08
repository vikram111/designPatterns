package per.vikram.abstractFactory;

public class GcpStorage implements Storage {
    @Override
    public String getId() {
        return "gcp storage";
    }

    @Override
    public String toString() {
        return getId();
    }
}
