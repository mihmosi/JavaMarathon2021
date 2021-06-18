package day11.task2.model;

import day11.task2.PhysAttack;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    static final int MAX_HEALTH = 100;
    int health;     //(здоровье)
    int physAttack;     // (величина физической атаки),
    double physDef;  //(процент поглощения физического урона)
    double magicDef;    //(процент поглощения магического урона)

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAttack * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
