package bridge.fighter;

public class WarriorFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Warrior Attack");
    }

    @Override
    public void protect() {
        System.out.println("Warrior Protect");
    }
}
