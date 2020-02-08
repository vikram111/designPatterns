package per.vikram.prototype;

public class Soldier extends Legion implements Cloneable{
    private String soldierName;

    @Override
    protected void reset() {
        this.soldierName = "Morphius";
    }

    @Override
    public String toString() {
        return "Soldier's name is "+soldierName;
    }

    public void ariyaSoldier(){
        this.soldierName = "A soldier has no name";
    }
}
