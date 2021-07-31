package com.github.jcarlosj.mundopc;

public class Monitor {
    // Atributos staticos
    private final int ID;
    private static int counter;
    private String brand;
    private String size;

    // Constructor
    private Monitor() {
        this .ID = ++ Monitor .counter;
    }

    // Constructor sobrecargado
    public Monitor( String brand, String size ) {
        this();

        this .brand = brand;
        this .size = size;
    }

    // Getters and setters
    public int getID() {
        return this .ID;
    }

    public String getBrand() {
        return this .brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return this .size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor [ ID: " + ID + ", brand: " + brand + ", size: " + size + " ]";
    }

}
