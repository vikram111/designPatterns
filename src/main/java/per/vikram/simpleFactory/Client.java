package per.vikram.simpleFactory;

public class Client {
    public static void main(String[] args) throws InvalidIdMethodException{
        HealthCardIdGenerator healthCardIdGenerator = HealthCardFactory.getInstance("lambda");
        System.out.println(healthCardIdGenerator.generateId());

    }
}
