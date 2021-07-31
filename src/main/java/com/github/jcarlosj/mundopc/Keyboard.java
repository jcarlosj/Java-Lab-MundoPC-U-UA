package com.github.jcarlosj.mundopc;

public class Keyboard extends Device {
    // Atributos staticos
    private final int ID;
    private static int counter;

    // Constructor
    public Keyboard( String inputType, String brand ) {
        super( inputType, brand );

        this .ID = ++Keyboard .counter;
    }

    @Override
    public String toString() {
        return "Keyboard { ID: " + ID + ", " + super.toString() + " }";
    }
}
