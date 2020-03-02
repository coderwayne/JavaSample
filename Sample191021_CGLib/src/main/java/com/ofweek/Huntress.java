package com.ofweek;

public class Huntress {
    public void transformIntoLeopard() {
        System.out.println("变身为猎豹");
    }

    public int throwJavelin(String enemy) {
        System.out.println("对" + enemy + "造成100点伤害");
        return 100;
    }

    public void setTrap(int x, int y) {
        System.out.println("在(" + x + ", " + y + ")处放置了一个陷阱");
    }

    public void transformIntoHuman() {
        System.out.println("变身为人形");
    }

    public int clawAttack() {
        System.out.println("对前方敌人共造成200点伤害");
        return 200;
    }
}