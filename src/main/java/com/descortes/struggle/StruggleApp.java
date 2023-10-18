package com.descortes.struggle;


import com.descortes.struggle.model.Character;
import com.descortes.struggle.model.enums.Stage;
import com.descortes.struggle.model.enums.Weapon;
import com.descortes.struggle.service.BattleService;
import com.descortes.struggle.service.impl.BattleServiceImpl;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class StruggleApp {

    private static BattleService battleService;

    public static String run(String estadio, String humano, String espada, String humano1, String espada1) {
        //validaciones
        if(StringUtils.isBlank(estadio) || StringUtils.isBlank(humano) || StringUtils.isBlank(humano1)
                || StringUtils.isBlank(espada) || StringUtils.isBlank(espada1)){
            return "Ningun atributo del juego puede ser nulo!!";
        }

        final Stage stage = Stage.fromString(estadio);

        if(Objects.isNull(stage)){
            return "error: escenario desconocido";
        }

        //Inicialización del servicio con el escenario
        battleService = new BattleServiceImpl(stage);

        Character firstContender = Character.characterSelector(humano);

        if(Objects.isNull(firstContender)){
            return "El primer personaje elegido es invalido!";
        }
        firstContender.setWeapon(Weapon.fromString(espada));

        Character secondContender = Character.characterSelector(humano1);

        if(Objects.isNull(secondContender)){
            return "El segundo personaje elegido es invalido!";
        }
        secondContender.setWeapon(Weapon.fromString(espada1));

        return battleService.battle(firstContender, secondContender);

    }
}
