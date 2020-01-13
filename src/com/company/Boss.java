package com.company;

import java.util.Random;

public class Boss {
    int health;
    int damage;
  public static   String superAbility;
    public static String bossDefenceType = "";
    public static String[] heroesAttackType = {"Physical",
            "Magical", "Mental", "Heal", "ability"};


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
    public static void changeBossDefence() {
        Random r = new Random();
        int randomIndex = r.nextInt(heroesAttackType.length); //0, 1, 2
        bossDefenceType = heroesAttackType[randomIndex];
    }

}
