package com.number;

public class FizzBuzz {
    int value;

    public FizzBuzz(int x) {
        value=x;
    }

    public FizzBuzz() {}


    public String outputAnswerString() {
        if(value == 3)
            return "Fizz";
        return "Blah";
    }
}
