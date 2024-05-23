package com.baseball.model.createmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandom {
    List<Integer> random = new ArrayList<>();

    public CreateRandom() {
        Random random = new Random();

        while (true) {
            int newRan = random.nextInt(10);
            if (!this.random.contains(newRan)) {
                this.random.add(newRan);
            }
            if(this.random.size() == 3) break;
        }
    }

    public List<Integer> getRandom() {
        return random;
    }
}
