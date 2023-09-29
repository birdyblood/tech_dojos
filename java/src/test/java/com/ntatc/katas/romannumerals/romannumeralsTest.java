package com.ntatc.katas.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class romannumeralsTest {

    @Test
    public void when_given_one_shoud_return_i(){
        //Given:
        int myNumber = 1;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "I");
    }

    @Test
    public void when_given_four_shoud_return_iv(){
        //Given:
        int myNumber = 4;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "IV");
    }
    
    @Test
    public void when_given_five_shoud_return_v(){
        //Given:
        int myNumber = 5;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "V");
    }

    @Test
    public void when_given_six_shoud_return_vi(){
        //Given:
        int myNumber = 6;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "VI");
    }

    @Test
    public void when_given_nine_shoud_return_ix(){
        //Given:
        int myNumber = 9;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "IX");
    }

    @Test
    public void when_given_ten_shoud_return_x(){
        //Given:
        int myNumber = 10;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "X");
    }

    @Test
    public void when_given_fourteen_shoud_return_xiv(){
        //Given:
        int myNumber = 14;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XIV");
    }

    @Test
    public void when_given_fiveteen_shoud_return_xv(){
        //Given:
        int myNumber = 15;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XV");
    }

    @Test
    public void when_given_ninteen_shoud_return_xix(){
        //Given:
        int myNumber = 19;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XIX");
    }

    @Test
    public void when_given_twenty_shoud_return_xx(){
        //Given:
        int myNumber = 20;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XX");
    }

    @Test
    public void when_given_twenty_one_shoud_return_xxi(){
        //Given:
        int myNumber = 21;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XXI");
    }

    @Test
    public void when_given_twenty_four_shoud_return_xxiv(){
        //Given:
        int myNumber = 24;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XXIV");
    }

    @Test
    public void when_given_twenty_seven_shoud_return_xxvii(){
        //Given:
        int myNumber = 27;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XXVII");
    }

    @Test
    public void when_given_twenty_nine_shoud_return_xxix(){
        //Given:
        int myNumber = 29;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XXIX");
    }

    @Test
    public void when_given_thirty_four_shoud_return_xxxiv(){
        //Given:
        int myNumber = 34;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XXXIV");
    }

    @Test
    public void when_given_fourty_shoud_return_xl(){
        //Given:
        int myNumber = 40;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XL");
    }

    @Test
    public void when_given_fourty_eight_shoud_return_xlviii(){
        //Given:
        int myNumber = 48;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XLVIII");
    }

    @Test
    public void when_given_fifty_shoud_return_l(){
        //Given:
        int myNumber = 50;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "L");
    }
    
    @Test
    public void when_given_fifty_two_shoud_return_l(){
        //Given:
        int myNumber = 52;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "LII");
    }

    @Test
    public void when_given_eighty_nine_shoud_return_l(){
        //Given:
        int myNumber = 89;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "LXXXIX");
    }

    @Test
    public void when_given_ninety_shoud_return_l(){
        //Given:
        int myNumber = 90;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XC");
    }

    @Test
    public void when_given_ninety_eight_shoud_return_l(){
        //Given:
        int myNumber = 98;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XCVIII");
    }

    @Test
    public void when_given_ninety_nine_shoud_return_l(){
        //Given:
        int myNumber = 99;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "XCIX");
    }

    @Test
    public void when_given_one_hundred_shoud_return_l(){
        //Given:
        int myNumber = 100;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "C");
    }

    @Test
    public void when_given_one_hundred_twelve_shoud_return_l(){
        //Given:
        int myNumber = 112;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "CXII");
    }

    @Test
    public void when_given_one_hundred_ninety_eight_shoud_return_l(){
        //Given:
        int myNumber = 198;

        //When:
        String convertNumber = MyRomanNumeralConverter.mymethodtoconvertnumber(myNumber);

        //Then:
        assertEquals(convertNumber, "CXCVIII");
    }
}