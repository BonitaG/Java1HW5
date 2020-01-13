package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(20);
        System.out.println(boss.getDamage());

        Warrior warrior = new Warrior(200,15,"hgsahg");
        System.out.println(warrior);
    }
}
