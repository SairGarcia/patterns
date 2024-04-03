package adapter;

public class Warrior implements Enemy{

    @Override
    public void attack() {
        System.out.println("Warrior Attack!!");
    }

    @Override
    public void damage() {
        System.out.println("Warrior Damage!!");
    }
}
