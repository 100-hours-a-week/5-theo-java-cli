package com.baseball.controller;

import java.util.List;

public class DataController {
    private int strike = 0;
    private int ball = 0;
    private int gameEnd;


    public void judgeScore(List<Integer> user, List<Integer> cpu) {
        gameEnd = cpu.size();
        this.strike = 0;
        this.ball = 0;
        for (int i = 0; i < cpu.size(); i++) {
            if (user.get(i) == cpu.get(i)) {
                this.strike++;
            }
            if (user.get(i) != cpu.get(i) && cpu.contains(user.get(i))) {
                this.ball++;
            }
        }
    }

    public boolean printScore() {
        System.out.println(strike + " 스트라이크  " + ball + " 볼");
        if (strike == gameEnd) return true;
        return false;
    }
}
