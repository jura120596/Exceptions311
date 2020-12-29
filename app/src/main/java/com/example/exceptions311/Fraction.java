package com.example.exceptions311;

import java.util.Objects;

public class Fraction extends Object{
    private int num;
    private int denum;
    public Fraction(int num, int denum) throws ZeroDenumException { //TODO:
        setNum(num);
        this.setDenum(denum);
    }
    public Fraction(int num) throws ZeroDenumException { //TODO:
        setNum(num);
        this.setDenum(1);
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getDenum() {
        return denum;
    }
    public void setDenum(int denum)
            throws ZeroDenumException { // предупреждаем об исключении :TODO
        if (denum == 0) {
            throw new ZeroDenumException();
            //выкидываем исключение, для остановки
        }
        this.denum = denum;
    }

    @Override
    public boolean equals(Object o) {
        Fraction fraction = (Fraction) o;
        return num == fraction.num &&
                denum == fraction.denum;
    }

    @Override
    public String toString() {
        return num +"/" + denum;
    }
}
