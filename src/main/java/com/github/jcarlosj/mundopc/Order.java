package com.github.jcarlosj.mundopc;

public class Order {
    // Atributos staticos
    private final int ID;
    private static int counter;
    private static final int MAXIMUM_QUANTITY = 10;

    // Atributos
    private Computer products[];
    private int totalProducts;

    // Constructor
    public Order() {
        this .products = new Computer[ Order .MAXIMUM_QUANTITY ];
        this .ID = ++ Order .counter;
    }

    public void add( Computer product ) {
        if( this .totalProducts < Order .MAXIMUM_QUANTITY ) {
            this .products[ this .totalProducts ++ ] = product;

            return;
        }

        System.out.println( "Se ha superado el limite de productos que es: " + Order .MAXIMUM_QUANTITY );

    }
    
    public void showOrder() {
        System .out .println( "===== ID Orden: " + this .ID + " =====" );
        System.out.println( this .totalProducts > 0 ? "Productos: " : "Orden sin productos.." );

        for( int i = 0; i < this .totalProducts; i++ ) {
            System.out.println( this .products[ i ] );
        }

    }
    
}
