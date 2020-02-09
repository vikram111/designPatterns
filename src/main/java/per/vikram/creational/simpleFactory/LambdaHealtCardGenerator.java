package per.vikram.creational.simpleFactory;

public class LambdaHealtCardGenerator implements HealthCardIdGenerator {
    @Override
    public String generateId() {
        return "LambdaUniqueId";
    }
}
