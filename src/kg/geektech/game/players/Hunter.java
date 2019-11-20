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
        int x = r.nextInt(3)+2;
//        heroes[1].setDamage(10*x);
        boss.setHealth(boss.getHealth()-heroes[1].getDamage() *x);
        if (boss.getHealth()<1) boss.setHealth(0);
        System.out.println("Boss health after hunter damage = " + boss.getHealth());
    }
}
