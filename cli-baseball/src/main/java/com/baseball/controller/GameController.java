package com.baseball.controller;


import com.baseball.model.createmodel.ExtendMode;
import com.baseball.model.createmodel.NormalMode;
import com.baseball.model.inputmodel.UserInput;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    List<Integer> randomNum = new ArrayList<>();
    UserInput ui = new UserInput();

    public GameController() {
        mainGame();
    }

    // 유저에게 입력받고 비교하는 함수.
    private void baseballGame() {
        DataController dataController = new DataController();

        while (true) {
            UserInput user = new UserInput();
            System.out.print(randomNum.size() + "자리 숫자를 입력해주세요 : ");
            user.userInput();
            dataController.judgeScore(user.getUserInput(), randomNum);
            System.out.println(randomNum);
            if (dataController.printScore()) break;
        }
    }

    // 게임의 흐름을 컨트롤하는 함수.
    private void mainGame() {
        boolean gameState = true;

        while (gameState) {
            System.out.print("3자리 게임은 0, 5자리 게임은 1 을 입력해주세요. : ");
            selectMode(ui.userInt());
            baseballGame();
            System.out.print("계속하시려면 0, 끝내시려면 1 을 입력해주세요. : ");
            if (ui.userInt() == 1) gameState = false;
        }
    }

    // 게임의 모드를 선택하는 함수. 1을 입력시 5자리 모드로 실행
    private List<Integer> selectMode(int num) {
        NormalMode normalMode = new NormalMode();
        ExtendMode extendMode = new ExtendMode();

        if (num == 1) {
            return randomNum = extendMode.getRandom();
        }
        return randomNum = normalMode.getRandom();
    }

}
