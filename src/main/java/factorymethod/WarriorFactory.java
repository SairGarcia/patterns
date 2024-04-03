package factorymethod;

public class WarriorFactory extends EnemyFactory {
    /**
     * interface methods implemented
     */
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }
}
