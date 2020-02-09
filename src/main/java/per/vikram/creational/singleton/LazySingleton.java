package per.vikram.creational.singleton;
/**
 * Lazy singleton with double check locking and volatile to avoid thread contention causing
 * incorrect object creation behaviour
 */

public class LazySingleton {
    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){

    }

    public LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
