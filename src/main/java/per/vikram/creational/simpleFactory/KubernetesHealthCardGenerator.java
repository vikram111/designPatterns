package per.vikram.creational.simpleFactory;

public class KubernetesHealthCardGenerator implements HealthCardIdGenerator {
    @Override
    public String generateId() {
        return "KubeUniqueId";
    }
}
