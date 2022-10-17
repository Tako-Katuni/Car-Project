package com.project1;
import com.project1.brand.AlfaRomeo;
import com.project1.brand.Maserati;
import com.project1.brand.Tesla;
import com.project1.countries.Country;

public class Main {
    public static void main(String[] args){

        Country usa = new Country("Usa");
        Country austria = new Country("Austria");
        Country georgia = new Country("Georgia");



        Tesla tesla=new Tesla( 125000, "Tesla", "Red", "Model X");
        tesla.SellingCountries(usa);
        tesla.SellingCountries(austria);
        tesla.SellingCountries(georgia);
        System.out.println(tesla);

        Maserati maserati=new Maserati( 2000000, "Maserati", "blue", "Gran Turismo");
        maserati.SellingCountries(austria);
        maserati.SellingCountries(usa);
        System.out.println(maserati);

        AlfaRomeo alfaromeo=new AlfaRomeo( 1500000, "AlfaRomeo", "Elegant black", "1 Montreal");
        alfaromeo.SellingCountries(austria);

        System.out.println(alfaromeo);


    }

}
