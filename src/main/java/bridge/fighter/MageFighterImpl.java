package bridge.fighter;

public class MageFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Mage Attack");
    }

    @Override
    public void protect() {
        System.out.println("Mage Protect");
    }
}
