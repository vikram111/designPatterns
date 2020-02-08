package per.vikram.prototype;

public class General extends Legion {
    private String generalName;
    @Override
    protected void reset() {
        this.generalName = "Maximus";
    }

    @Override
    protected Legion clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException("General cant be cloned");
    }

    @Override
    public String toString() {
        return "General's name is "+generalName;
    }
}
