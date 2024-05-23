package com.baseball.model.createmodel;

import java.util.Random;

public class CreateExRandom extends CreateRandom{

    public CreateExRandom(){
        Random random = new Random();

        while (true) {
            int newRan = random.nextInt(10);
            if (!this.random.contains(newRan)) {
                this.random.add(newRan);
            }
            if(this.random.size() == 5) break;
        }
    }
}
