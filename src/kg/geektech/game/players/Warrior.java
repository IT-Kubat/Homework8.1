package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.UNIQUE_ABILITY, AbilityType.SAME_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
//        heroes[0].setDamage(10+boss.getDamage());
        boss.setHealth(boss.getHealth()-(boss.getDamage() + heroes[0].getDamage()));
        if (boss.getHealth()<1) boss.setHealth(0);
        System.out.println("boss health after warrior damage = " + boss.getHealth());

    }
}
