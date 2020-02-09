package per.vikram.creational.objectPool;

public class Client {
    private static final ObjectPool<BitmapImage> bitmapImageObjectPool = new ObjectPool<>(()->new BitmapImage("flower.bmp"),3);

    public static void main(String[] args) {
        BitmapImage bitmapImage = bitmapImageObjectPool.get();
        bitmapImage.draw(4,5);
        BitmapImage bitmapImage1 = bitmapImageObjectPool.get();
        bitmapImage1.draw(2,3);
        bitmapImageObjectPool.release(bitmapImage);
        bitmapImageObjectPool.release(bitmapImage1);
    }
}
