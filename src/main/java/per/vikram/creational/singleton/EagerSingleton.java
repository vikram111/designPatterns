package per.vikram.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton(){

    }

    public EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
