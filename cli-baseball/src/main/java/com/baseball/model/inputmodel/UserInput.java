package com.baseball.model.inputmodel;

import java.util.Scanner;

public class UserInput {
    private String str;
    Scanner sc = new Scanner(System.in);

    public void userInput() {
        str = sc.nextLine();
    }

    public int userInt(){
        return sc.nextInt();
    }

    public String getUserInput() {
        return str;
    }
}
