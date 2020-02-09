package per.vikram.creational.objectPool;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ObjectPool<T extends Poolable> {
    private BlockingQueue<T> blockingQueue;

    public ObjectPool(Supplier<T> supplier, int cache){
        blockingQueue = new LinkedBlockingQueue<>();
        IntStream.range(0,cache).forEach(item -> blockingQueue.offer(supplier.get()));
    }

    public T get(){
        try{
            return blockingQueue.take();
        }catch (InterruptedException interruptedException){
            System.out.println("The take operation was interrupted");
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try {
            blockingQueue.put(obj);
        }catch (InterruptedException interruptedException){
            System.out.println(interruptedException);
        }
    }
}
