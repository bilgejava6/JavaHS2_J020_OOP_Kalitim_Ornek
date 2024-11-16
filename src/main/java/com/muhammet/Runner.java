package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.tur = "Ankara Kedisi";
        kedi.yemekYe();

        for (int i=1; i<=24*1120;i++){
            kedi.birSaatGecsin();
        }

        System.out.println("kedinin zamanı...: "+ kedi.saat);
    }
}