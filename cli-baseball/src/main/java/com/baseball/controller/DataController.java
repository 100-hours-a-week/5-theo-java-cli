package com.baseball.controller;

import java.util.List;

public class DataController {
    private int strike = 0;
    private int ball = 0;
    private int gameEnd;

    // random과 사용자의 입력을 비교하는 로직 구현
    public void judgeScore(List<Integer> user, List<Integer> cpu) {
        resetScore(cpu.size());
        for (int i = 0; i < cpu.size(); i++) {
            if (user.get(i) == cpu.get(i)) {
                this.strike++;
            }
            if (user.get(i) != cpu.get(i) && cpu.contains(user.get(i))) {
                this.ball++;
            }
        }
    }

    // 입력마다 카운트 초기화 시켜주는 함수
    public void resetScore(int end) {
        gameEnd = end;
        this.strike = 0;
        this.ball = 0;
    }

    // 맞은 갯수에 따라 출력해주는 함수
    public boolean printScore() {
        if (strike == gameEnd) {
            System.out.println("축하합니다 ! 숫자를 정확히 맞추셨습니다 !");
            return true;
        }
        System.out.println(strike + " 스트라이크  " + ball + " 볼");
        return false;
    }
}
