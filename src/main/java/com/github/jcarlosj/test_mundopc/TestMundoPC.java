package com.github.jcarlosj.test_mundopc;

import com.github.jcarlosj.mundopc.*;

public class TestMundoPC {
    public static void main( String[] args ) throws Exception {
        Order order1 = new Order();
        order1 .add( new Computer( "Computador HP", new Monitor( "HP", "13 \"" ), new Keyboard( "Bluetooth", "HP" ), new Mouse( "Bluetooth", "HP" ) ) );
        order1 .add( new Computer( "Computador Xiaomi", new Monitor( "Xiaomi", "19 \"" ), new Keyboard( "Bluetooth", "Xiaomi" ), new Mouse( "Bluetooth", "Xiaomi" ) ) );
        order1 .showOrder();

        Order order2 = new Order();
        order2 .showOrder();

        Order order3 = new Order();
        order3 .add( new Computer( "Computador Gamer", new Monitor( "Samsung", "32 \"" ), null, null ) );
        order3 .showOrder();
    }
}
