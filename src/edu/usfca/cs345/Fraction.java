package edu.usfca.cs345;

public class Fraction extends Num {
    private int numerator;
    private int denominator;
    public Fraction(int numer, int denomer){
        numerator = numer;
        denominator = denomer;
    }

    public double doubleValue(){
        return ((double) numerator) / ((double) denominator);
    }
    public String toString(){
        return (numerator + "/" + denominator);
    }
}
