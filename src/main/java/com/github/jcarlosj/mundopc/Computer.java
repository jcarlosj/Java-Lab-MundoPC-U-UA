package com.github.jcarlosj.mundopc;

public class Computer {
    // Atributos staticos
    private final int ID;
    private static int counter;

    // Atributos
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    // Constructor
    private Computer() {
        this .ID = ++ Computer .counter;
    }

    // Constructor sobrecargado
    public Computer( String name, Monitor monitor, Keyboard keyboard, Mouse mouse ) {
        this();

        this .name = name;
        this .monitor = monitor;
        this .keyboard = keyboard;
        this .mouse = mouse;
    }

    
    // Getters and setters
    public int getID() {
        return ID;
    }

    public String getName() {
        return this .name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return this .monitor;
    }

    public void setMonitor( Monitor monitor ) {
        this .monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return this .keyboard;
    }

    public void setKeyboard( Keyboard keyboard ) {
        this .keyboard = keyboard;
    }

    public Mouse getMouse() {
        return this .mouse;
    }

    public void setMouse( Mouse mouse ) {
        this .mouse = mouse;
    }

    @Override
    public String toString() {

        // StringBuilder: Almacena cadenas de caracteres.
        StringBuilder sb = new StringBuilder();

        // StringBuilder: Su tamaño y contenido pueden modificarse. Los objetos de éste tipo son mutables. Esto es una diferencia con los String
        sb .append( "  Computador: [ " );
        sb .append( "id: " ) .append( this .ID + ", " );
        sb .append( "name: " ) .append( this .name + ", " );
        sb .append( "monitor: " ) .append( this .monitor + ", " );
        sb .append( "keyboard: " ) .append( this .keyboard + ", " );
        sb .append( "mouse: " ) .append( this .mouse + ", " );
        //sb .append( "memoria: " ) .append( super .toString() );        //  Agregamos los datos de la clase padre (Direccion de memoria)
        sb .append( " ]" );

        return sb .toString();
    }

}
