package com.ntatc.katas.romannumerals;

public class MyRomanNumeralConverter {

    public static String mymethodtoconvertnumber(int myNumber) {
        String romanNumber = "";
        if(myNumber < 100){
            romanNumber = belowHundred(myNumber);
        } else if (myNumber == 100){
            romanNumber = "C";
        } else if (myNumber > 100){
            romanNumber = "C";
            romanNumber = romanNumber + belowHundred(myNumber-100);
        }
        return romanNumber;
    }

    private static String addXs(int number) {
        String numX = "";
        for(int i = 0; i < number / 10; i++) {
            numX = numX + "X";
        }

        return numX;
    }

    private static String addIs(int number) {
        String numi = "";
        for (int i = 0; i < number; i++) {
            numi = numi + "I";
        }
        return numi;
    }

    private static String belowNine(int number){
        String numRoman = "";
        if (number < 4) {
            numRoman = numRoman + addIs(number);
        } else if (number == 4) {
            numRoman = "IV";
        } else if (number > 4 && number < 9) {
            numRoman = "V";
            numRoman = numRoman + addIs(number - 5);
        } else if (number == 9) {
            numRoman = "IX";
        }

        return numRoman;
    }

    private static String belowHundred(int number){
        String numRoman = "";
        if (number <= 9) { 
            numRoman = belowNine(number);
        } else if (number > 9 && number < 40) {
            numRoman = addXs(number);
            int countX = numRoman.length();
            numRoman = numRoman + belowNine(number - (10 * countX));
        } else if (number > 39 && number < 50) {
            numRoman = "XL";
            numRoman = numRoman + belowNine(number - 40);
        } else if (number > 49 && number < 90){
            numRoman = "L";
            numRoman = numRoman + addXs(number-50);
            int countX = numRoman.length() - 1;
            numRoman = numRoman + belowNine(number -50 - (10 * countX));
        } else if (number > 89 && number < 100){
            numRoman = "XC";
            numRoman = numRoman + belowNine(number-90);
        } 
        return numRoman;
    }
}
