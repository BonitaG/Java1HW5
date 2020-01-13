package com.company;

public class Magic {
    int health;
    int damage;
    String superAbility;


    public Magic(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero[] creation() {
        Hero[] heroes = new Hero[4];
        Hero warrior = new Hero(150, 200, " Physical ");
        heroes[0] = warrior;
        Hero magic = new Hero(150, 200, " Magic ");
        heroes[1]= magic;
        Hero mental =new Hero (150, 200, " Mental ");
        heroes[2]=mental;
        Hero heal =new Hero (150, 200, " Heal ");
        heroes[3]=heal;
        return heroes;







    }
}
