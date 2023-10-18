package com.descortes.struggle.model;

import com.descortes.struggle.model.enums.Weapon;

public class Character {
    private Weapon weapon;
    private int points;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static Character characterSelector(String character){
        switch (character){
            case "humano":
                return new Human(1);
            case "vampiro":
                return new Vampire(2);
            case "lobo":
                return new Wolf(3);
            default:
                return null;
        }
    }
}
