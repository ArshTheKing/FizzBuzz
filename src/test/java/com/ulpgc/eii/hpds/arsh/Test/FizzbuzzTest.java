package com.ulpgc.eii.hpds.arsh.Test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzbuzzTest{

    private Fizzbuzz fizzbuzz= new Fizzbuzz();

    @Test
    public void baseAssert(){
        assertThat(fizzbuzz.value(1)).isEqualTo("1");
        assertThat(fizzbuzz.value(2)).isEqualTo("2");
    }

    @Test
    public void threeMultipleAssert(){
        assertThat(fizzbuzz.value(3)).isEqualTo("Fizz");
        assertThat(fizzbuzz.value(6)).isEqualTo("Fizz");
    }
    @Test
    public void fiveMultipleAssert(){
        assertThat(fizzbuzz.value(5)).isEqualTo("Buzz");
        assertThat(fizzbuzz.value(10)).isEqualTo("Buzz");
    }
    @Test
    public void fifteenMultipleAssert(){
        assertThat(fizzbuzz.value(15)).isEqualTo("FizzBuzz");
        assertThat(fizzbuzz.value(30)).isEqualTo("FizzBuzz");
    }


    private static class Fizzbuzz {
        public boolean val;

        public String value(int i) {
            if(is(i).isMultipleOf(15)) return "FizzBuzz";
            if(is(i).isMultipleOf(3)) return "Fizz";
            if(is(i).isMultipleOf(5)) return "Buzz";
            return String.valueOf(i);
        }

        private Eval is(int i) {
            return factor -> i % factor == 0;
        }
        private interface Eval{
            boolean isMultipleOf(int factor);
        }
    }
}
