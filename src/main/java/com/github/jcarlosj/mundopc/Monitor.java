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

        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( "{ " );
        sb .append( "id: " ) .append( this .ID + ", " );
        sb .append( "brand: " ) .append( this .brand + ", " );
        sb .append( "size: " ) .append( this .size );
        //sb .append( "memoria: " ) .append( super .toString() );        //  Agregamos los datos de la clase padre (Direccion de memoria)
        sb .append( " }" );

        return sb .toString();
    }

}
