package com.descortes.struggle.model.enums;

import com.descortes.struggle.model.Character;
import com.descortes.struggle.model.Human;
import com.descortes.struggle.model.Vampire;
import com.descortes.struggle.model.Wolf;

public enum Stage {

    STADIUM,
    NIGHT,
    RAIN,
    FOREST,
    CITY;

    public static Stage fromString(String stage){
       switch (stage){
           case "estadio":
               return STADIUM;
           case "noche":
               return NIGHT;
           case "lluvia":
               return RAIN;
           case "bosque":
               return FOREST;
           case "ciudad":
               return CITY;
           default:
               return null;
       }
    }

    /**
     * Aumenta o reduce la cantidad de puntos del personaje dependiendo el escenario
     * @param stage el escenario
     * @param character el personaje a buffear o nerfear
     * @return puntos del personaje con el buff o nerf aplicado o los puntos por defecto si no aplica ningun caso
     */
    public static int getCharacterPointsBuffedOrNerfedByStage(Stage stage, Character character){
        int basePoints = character.getPoints();
        if(stage.equals(STADIUM)){
            return basePoints;
        } else if(stage.equals(NIGHT) && character instanceof Vampire){
            return basePoints * 2;
        } else if( stage.equals(RAIN) && character instanceof Vampire){
            return basePoints - 1;
        } else if(stage.equals(FOREST) && character instanceof Wolf){
            return  basePoints * 3;
        } else if( stage.equals(CITY) && character instanceof Human){
            return basePoints * 2;
        }
        return basePoints;
    }
}
