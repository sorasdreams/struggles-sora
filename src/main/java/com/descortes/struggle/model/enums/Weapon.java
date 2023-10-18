package com.descortes.struggle.model.enums;

public enum Weapon {

    DISARMED(0),
    KNIFE(2),
    SWORD(0);
    private final int points;
    Weapon(int points) {
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
    public static Weapon fromString(String weapon){
        switch (weapon){
            case "cuchillo":
                return KNIFE;
            case "espada":
                return SWORD;
            default:
                return DISARMED;
        }
    }

    public static int buffByWeapon(int points, Weapon weapon){
       switch (weapon){
           case KNIFE:
               return points + KNIFE.getPoints();
           case SWORD:
               return points * 2;
           default:
               return points + DISARMED.getPoints();
       }
    }

}
