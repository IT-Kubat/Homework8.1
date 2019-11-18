package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
