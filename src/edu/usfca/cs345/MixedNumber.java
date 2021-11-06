package edu.usfca.cs345;

public class MixedNumber extends Num{
    private int wholeNumber;
    private int numerator;
    private int denominator;
    public MixedNumber(int numer, int denomer, int wholenum){
        numerator = numer;
        denominator = denomer;
        wholeNumber = wholenum;
    }

    public double doubleValue(){
        return (((double) numerator) / ((double) denominator) + wholeNumber);
    }
    public String toString(){
        return (wholeNumber + " " + numerator + "/" + denominator);
    }
}
