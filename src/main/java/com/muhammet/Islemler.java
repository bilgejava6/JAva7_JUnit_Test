package com.muhammet;

public class Islemler {

    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public double bol(double sayi1, double sayi2) {
        if(sayi2 == 0)
            return 0;
        return sayi1 / sayi2;
    }
}
