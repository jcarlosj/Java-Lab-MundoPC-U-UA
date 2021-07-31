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

        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( "{ " );
        sb .append( "id: " ) .append( this .ID );
        sb .append( super .toString() );        //  Agregamos los datos de la clase padre (Direccion de memoria)
        sb .append( " }" );

        return sb .toString();
    }

}
