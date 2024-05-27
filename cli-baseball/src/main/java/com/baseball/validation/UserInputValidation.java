package com.baseball.validation;


import java.util.ArrayList;
import java.util.List;

public class UserInputValidation {
    private List<Integer> arr = new ArrayList<>();

    public List<Integer> userInputValidation(String str) {
        if (!inputTypeValid(str) && !inputLengthValid(str)) {
            System.out.println("잘못된 입력입니다.");
        }
        convertInput(str);

        return arr;
    }


    private boolean inputTypeValid(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    private boolean inputLengthValid(String str) {
        return str.length() == 3;
    }

    private void convertInput(String str) {
        String[] conv = str.split("");

        for (int i = 0; i < conv.length; i++) {
            arr.add(Integer.parseInt(conv[i]));
        }
    }
}
