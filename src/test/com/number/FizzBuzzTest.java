package com.number;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void fizzbuzzShouldReturnString() {
        FizzBuzz number = new FizzBuzz(1);

        //String actualResult = number.outputAnswerString();
        assertEquals(true, number.outputAnswerString() instanceof String);
    }

    @Test
    public void fizzbuzzOneShouldReturnBlah() {
        FizzBuzz number = new FizzBuzz(1);

        String actualResult = number.outputAnswerString();
        assertEquals("Blah",actualResult);
    }

    @Test
    public void fizzbuzzThreeShouldReturnFizz() {
        FizzBuzz number = new FizzBuzz(3);

        String actualResult = number.outputAnswerString();
        assertEquals("Fizz",actualResult);
    }

    @Test
    public void fizzbuzzFiveShouldReturnBuzz() {
        FizzBuzz number = new FizzBuzz(5);

        String actualResult = number.outputAnswerString();
        assertEquals("Buzz",actualResult);
    }

    @Test
    public void fizzbuzzSixShouldReturnFizz() {
        FizzBuzz number = new FizzBuzz(6);

        String actualResult = number.outputAnswerString();
        assertEquals("Fizz",actualResult);
    }

    @Test
    public void fizzbuzzTenShouldReturnBuzz() {
        FizzBuzz number = new FizzBuzz(10);

        String actualResult = number.outputAnswerString();
        assertEquals("Buzz",actualResult);
    }

    @Test
    public void fizzbuzzFifteenShouldReturnBuzz() {
        FizzBuzz number = new FizzBuzz(15);

        String actualResult = number.outputAnswerString();
        assertEquals("FizzBuzz",actualResult);
    }


}