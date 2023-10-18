package com.descortes.struggle.service.impl;

import com.descortes.struggle.model.Character;
import com.descortes.struggle.model.enums.Stage;
import com.descortes.struggle.model.enums.Weapon;
import com.descortes.struggle.service.BattleService;

public class BattleServiceImpl implements BattleService {

    private final Stage stage;

    public BattleServiceImpl(Stage stage){
        this.stage = stage;
    }
    @Override
    public String battle(Character firstContender, Character secondContender) {
        final int firstCharacterTotalPoints = Weapon.buffByWeapon(Stage.getCharacterPointsBuffedOrNerfedByStage(stage, firstContender), firstContender.getWeapon());
        final int secondCharacterTotalPoints = Weapon.buffByWeapon(Stage.getCharacterPointsBuffedOrNerfedByStage(stage, secondContender), secondContender.getWeapon());

        firstContender.setPoints(firstCharacterTotalPoints);
        secondContender.setPoints(secondCharacterTotalPoints);

        if(firstCharacterTotalPoints > secondCharacterTotalPoints){
            return "Resultado: gana 1";
        } else if(firstCharacterTotalPoints == secondCharacterTotalPoints){
            return "Resultado: empate";
        } else {
            return "Resultado: gana 2";
        }
    }
}
