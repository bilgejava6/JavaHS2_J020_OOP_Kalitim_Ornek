package com.muhammet.entity;

import java.util.Scanner;

public class Hayvanlar {
    /**
     * - hayvanların genelinde ortak olan özellikleri buraya ekleyiniz. 10-15 adet
     * - hayvanlarda ortak olan davranışları buraya ekleyiniz. 2-3
     */
    public String tur;
    public String ad;

    public String alem;
    public String yasamAlani;
    public int uzunluk;
    public int agirlik;

    public int yasamSuresi; // gün
    public long saat=0;
    public int yas=0;
    public boolean acMi;
    public boolean asiliMi;
    /**
     * 1-> Etobur
     *
     * 2-> Otobur
     */
    public String beslenmeSekli;
    /**
     * 0- uyuyor
     * 1- uyanık yatıyor
     * 2- yürüyor
     * 3- uyanık duruyor
     * 4- koşuyor
     * 5- dinlenme modu
     * 6- aktif
     * 7- hızlıca yüzüyor
     */
    public int hareketTuru;

    // Aksiyonlar - Methodlar
    public void yemekYe(){
        System.out.println(tur+" hayvanı yemeğini yedi");
        acMi = false;
    }


    public void birSaatGecsin(){
        saat++;
        if(saat%24==0)
            yaslandir();
        aclikKontrolu();
    }

    public void yaslandir(){
        yasamSuresi++;
        if(yasamSuresi%365==0) {
            yas++;
            System.out.println(yas+". Doğum günü");
        }
    }

    public void aclikKontrolu(){
        if(saat%4==0){
            acMi = true;
            System.out.print("ben acıktım doyur[E/H]...:  ");
            String secim = new Scanner(System.in).nextLine();
            if(secim.equalsIgnoreCase("E"))
                yemekYe();
        }
    }

}
