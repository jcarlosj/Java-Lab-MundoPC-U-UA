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
        return "Computer ( ID: " + ID + ", keyboard: " + keyboard + ", monitor: " + monitor + ", mouse: " + mouse + ", name: " + name + " )";
    }

}
