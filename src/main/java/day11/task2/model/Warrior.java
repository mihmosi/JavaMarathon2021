package day11.task2.model;

import day11.task2.PhysAttack;
import day11.task2.model.Hero;

public class Warrior extends Hero implements PhysAttack {
    public Warrior(){
        physDef = 0.8;
        physAttack = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
