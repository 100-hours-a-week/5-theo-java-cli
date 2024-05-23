package com.baseball.controller;

import com.baseball.model.createmodel.CreateExRandom;
import com.baseball.model.createmodel.CreateRandom;
import com.baseball.model.inputmodel.UserInput;
import com.baseball.validation.UserInputValidation;

import java.util.ArrayList;
import java.util.List;

public class GameController {
//    CreateRandom createRandom = new CreateRandom();
//    CreateExRandom createExRandom = new CreateExRandom();
    List<Integer> randomNum = new ArrayList<>();

    public GameController() {

        //여기에 모드 설정
        mainGame();
    }

    private void baseballGame() {
        DataController dataController = new DataController();

        while (true) {
            UserInputValidation userInput = new UserInputValidation();
            System.out.println(randomNum.size() + "자리 숫자를 입력해주세요 : ");
            dataController.judgeScore(userInput.userInputValidation(), randomNum);
            System.out.println(randomNum);
            if (dataController.printScore()) break;
        }
    }

    private void mainGame() {
        UserInput userInput = new UserInput();

        while (true) {
            System.out.println("3자리 게임은 0, 5자리 게임은 1 을 입력해주세요.");
            selectNum(userInput.userInt());
            baseballGame();
            System.out.println("계속하시려면 0, 끝내시려면 1 을 입력해주세요.");
            if (userInput.userInt() == 1) break;
        }
    }

    private List<Integer> selectNum(int num) {
        CreateRandom createRandom = new CreateRandom();
        CreateExRandom createExRandom = new CreateExRandom();

        if (num == 1) {
            return randomNum = createExRandom.getRandom();
        }
        return randomNum = createRandom.getRandom();
    }

}
