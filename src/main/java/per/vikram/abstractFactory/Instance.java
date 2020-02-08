package per.vikram.abstractFactory;

public interface Instance {
    enum Capacity{micro,small,large}
    void start();
    void stop();
    default void attachStorage(Storage storage){
        System.out.println("Storage "+storage+"attached");
    }
}
