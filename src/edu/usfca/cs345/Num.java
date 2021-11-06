package edu.usfca.cs345;

public abstract class Num extends Number implements Comparable<Num> {
    public float floatValue(){
        return (float) this.doubleValue();
    }
    public long longValue(){
        return (long) this.doubleValue();
    }
    public int intValue(){
        return (int) this.doubleValue();
    }
    public int compareTo(Num x){
        if (this.doubleValue() > x.doubleValue()){
            return 1;
        }
        else if (this.equals(x)){
            return 0;
        }
        else
            return -1;
    }
    public boolean equals(Object x){
        Num xd = (Num) x;
        return (this.doubleValue() == xd.doubleValue());
    }

}
