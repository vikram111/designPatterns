package per.vikram.simpleFactory;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Arrays;

public class HealthCardFactory {
    private static final String LAMBDA_TYPE = "lambda";
    private static final String KUBE_TYPE = "kube";

    public static HealthCardIdGenerator getInstance(String type) throws InvalidIdMethodException{
        switch (type){
            case LAMBDA_TYPE:
                return new LambdaHealtCardGenerator();
            case KUBE_TYPE:
                return new KubernetesHealthCardGenerator();
            default:
                throw new InvalidIdMethodException("This is an invalid argument");
        }
    }
}
