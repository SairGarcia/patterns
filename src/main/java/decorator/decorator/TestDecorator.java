package decorator.decorator;

import decorator.Enemy;
import decorator.race.Elf;
import decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("======= Human Warrior ==========");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("======= Human Warrior Mage ==========");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();
        System.out.println("======= Elf Warrior Mage Assassin ==========");
        Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(
                new MageEnemyDecorator(
                        new WarriorEnemyDecorator(
                                new Elf()
                        )
                )
        );
        elfWarriorMageAssassin.attack();

    }
}
