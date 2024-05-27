package com.baseball.model.createmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NormalMode extends CreateModel {
    List<Integer> random = new ArrayList<>();

    public NormalMode(){
        createRandom();
    }

    @Override
    void createRandom() {
        Random random = new Random();

        while (this.random.size() != 3) {
            int newRan = random.nextInt(10);
            if (!this.random.contains(newRan)) {
                this.random.add(newRan);
            }
        }
    }

    @Override
    public List<Integer> getRandom() {
        return random;
    }
}
