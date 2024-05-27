package com.baseball.model.inputmodel;

import com.baseball.validation.UserInputValidation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    public List<Integer> arr = new ArrayList<>();
    UserInputValidation uiv = new UserInputValidation();


    public void userInput() {
        String str = sc.nextLine();
        arr = uiv.userInputValidation(str);
    }

    public int userInt(){
        return sc.nextInt();
    }

    public List<Integer> getUserInput() {
        return arr;
    }
}
