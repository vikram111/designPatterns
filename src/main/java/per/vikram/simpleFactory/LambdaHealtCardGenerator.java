package per.vikram.simpleFactory;

public class LambdaHealtCardGenerator implements HealthCardIdGenerator {
    @Override
    public String generateId() {
        return "LambdaUniqueId";
    }
}
