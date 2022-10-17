package com.project1.cars;

import java.util.List;

public abstract class Car implements Requirement{
    public abstract double price();
    public abstract String brand();
    public abstract String color();
    public abstract String model();

    public abstract String heatedSeats();

    public abstract List country();
}
