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

        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( "inputType: " ) .append( this .inputType + ", " );
        sb .append( "brand: " ) .append( this .brand );
        //sb .append( "memoria: " ) .append( super .toString() );        //  Agregamos los datos de la clase padre (Direccion de memoria)

        return sb .toString();
    }

}