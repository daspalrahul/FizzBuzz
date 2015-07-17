package com.number;

public class FizzBuzz {
    int value;

    public FizzBuzz(int x) {
        value=x;
    }

    public FizzBuzz() {}


    public String outputAnswerString() {
        if(value%3 == 0)
            return "Fizz";
        if(value == 5)
            return "Buzz";
        return "Blah";
    }
}
