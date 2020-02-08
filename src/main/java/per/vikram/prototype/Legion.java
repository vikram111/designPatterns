package per.vikram.prototype;

public abstract class Legion implements Cloneable{
    private String name;

    public Legion(){
        this.name = "Julius Caesar";
    }

    @Override
    protected Legion clone() throws CloneNotSupportedException {
        Legion legion = (Legion) super.clone();
        legion.initialize();
        return legion;
    }

    private void initialize() {
        this.name = "Julius Caesar";
        reset();
    }

    protected abstract void reset();


}
