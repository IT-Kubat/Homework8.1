package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAME_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
