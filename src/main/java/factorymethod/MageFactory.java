package factorymethod;

public class MageFactory extends EnemyFactory{
    /**
     * interface methods implemented
     */
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }
}
