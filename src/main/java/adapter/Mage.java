package adapter;

public class Mage implements Enemy{
    @Override
    public void attack() {
        System.out.println("Mage Attack!!");
    }

    @Override
    public void damage() {
        System.out.println("Mage Damage!!");
    }
}
