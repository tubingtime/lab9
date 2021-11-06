package edu.usfca.cs345;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /*Print Tests*/
        Fraction f = new Fraction(2,1);
        System.out.println(f);
        MixedNumber m = new MixedNumber(1,2,3);
        System.out.println(m.toString());

        /*CompareTo Tests*/
        Fraction fCopy = new Fraction(2,1);
        MixedNumber mCopy = new MixedNumber(1,2,3);
        MixedNumber mixed2 = new MixedNumber(2,2,1); /*2*/
        Fraction f2 = new Fraction(1,2);
        MixedNumber m2 = new MixedNumber(1,2,1); /* 1 1/2*/
        assert(f.compareTo(f2) > 0);
        System.out.println(f + " is greater than " + f);
        assert(f2.compareTo(m2) < 0);
        System.out.println(f2 + " is less than " + m2);
        assert(m.compareTo(m2) > 0);
        System.out.println(m + " is greater than " + m2);
        assert(m.equals(mCopy));
        System.out.println(m + " equals " + mCopy);
        assert f.equals(fCopy);
        System.out.println(f + " equals " + fCopy);
        assert(mixed2.equals(f));
        System.out.println(mixed2 + " equals " + f);
        ArrayList<Num> nList = new ArrayList<>();
        nList.add(f);nList.add(m);nList.add(f2);nList.add(m2);
        Collections.sort(nList);
        System.out.println(nList);

        Integer two = 2;
        System.out.println(f2.equals(two));
    }
}
