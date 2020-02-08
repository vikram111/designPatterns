package per.vikram.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
       Soldier soldier = new Soldier();
       soldier.ariyaSoldier();
       System.out.println(soldier);
       Soldier soldier1 = (Soldier) soldier.clone();
       System.out.println(soldier1);
       General general = new General();
       general.clone();

    }
}
