package com.project1.brand;

import com.project1.cars.Car;
import com.project1.cars.NoRequirement;
import com.project1.countries.Country;

import java.util.ArrayList;
import java.util.List;

public class Maserati  extends Car implements NoRequirement{
    private double prices;
    private String brands;
    private String colors;
    private String models;

    private List<Country> country;


    public Maserati(double prices, String brands, String colors, String models){
        this.prices= prices;
        this.brands= brands;
        this.colors= colors;
        this.models= models;
        this.country = new ArrayList();
    }
    public void SellingCountries(Country country){
        this.country.add(country);
    }
    private String AddingCountries(){
        String result="Selling countries ";
        for(Country s: this.country){
            result=result + s.getCountry()+"\n";
        }
        return result;
    }
    @Override
    public double price() {
        return this.prices;
    }

    @Override
    public String brand() {
        return this.brands;
    }

    @Override
    public String color() {
        return this.colors;
    }

    @Override
    public String model() {
        return this.models;
    }

    @Override
    public String heatedSeats() {
        return "This car had heated seats!";
    }


    @Override
    public String canDrive() {
        return "This car can definitely drive";
    }

    @Override
    public String autoPilot() {
        return null;
    }

    @Override
    public List country(){return this.country;}


    @Override
    public String toString(){
        return "Price: " + this.prices + "\n" + "Brand: " + this.brands + "\n" + "Color: " + this.colors + "\n" + "Model: " +
                this.models + "\n" + canDrive()+"\n"+AddingCountries();

    }
}
