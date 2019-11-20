package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, AbilityType.UNIQUE_ABILITY, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length-1; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+2);
            System.out.println("Magic Attack " + heroes[i].getClass().getName() +" damage = "+heroes[i].getDamage());

        }

    }
}
