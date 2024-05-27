package com.baseball.model.createmodel;

import java.util.Random;

public class ExtendMode extends NormalMode{
    public ExtendMode(){
        createRandom();
    }

    @Override
    void createRandom() {
        Random random = new Random();

        while (this.random.size() != 5) {
            int newRan = random.nextInt(10);
            if (!this.random.contains(newRan)) {
                this.random.add(newRan);
            }
        }
    }
}
