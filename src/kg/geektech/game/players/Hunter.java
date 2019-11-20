package kg.geektech.game.players;

import kg.geektech.game.Boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.UNIQUE_ABILITY, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int x = r.nextInt(4)+2;
        heroes[1].setDamage(heroes[1].getDamage()*x);
        System.out.println("Hunter damage = " + heroes[1].getDamage());
    }
}
