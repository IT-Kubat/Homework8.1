package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.UNIQUE_ABILITY, AbilityType.SAME_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(10+boss.getDamage());
        System.out.println("Warrior Damage = " + heroes[0].getDamage());

    }
}
