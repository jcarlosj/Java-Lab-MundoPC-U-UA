package com.github.jcarlosj.mundopc;

public class Device {
    // Atributos
    private String inputType;
    private String brand;

    // Constructor
    public Device( String inputType, String brand ) {
        this .inputType = inputType;
        this .brand = brand;
    }

    // Getters & Setters
    public String getInputType() {
        return this .inputType;
    }
    public void setInputType( String inputType ) {
        this .inputType = inputType;
    }
    public String getBrand() {
        return this .brand;
    }
    public void setBrand( String brand ) {
        this .brand = brand;
    }

    @Override
    public String toString() {
        return "Device [ brand: " + brand + ", inputType: " + inputType + " ]";
    }

}