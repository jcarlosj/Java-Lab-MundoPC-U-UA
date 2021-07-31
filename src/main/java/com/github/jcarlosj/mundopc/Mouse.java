package com.github.jcarlosj.mundopc;

public class Mouse extends Device {
    // Atributos staticos
    private final int ID;
    private static int counter;

    // Constructor
    public Mouse( String inputType, String brand ) {
        super( inputType, brand );

        this .ID = ++Mouse .counter;
    }

    @Override
    public String toString() {
        return "Mouse { ID: " + ID + ", " + super.toString() + " }";
    }

}
