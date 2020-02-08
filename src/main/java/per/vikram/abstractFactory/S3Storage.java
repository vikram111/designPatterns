package per.vikram.abstractFactory;

public class S3Storage implements Storage {
    @Override
    public String getId() {
        return "s3";
    }

    @Override
    public String toString() {
        return getId();
    }
}
