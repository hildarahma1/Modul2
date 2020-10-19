package com.hilda.Modul2.Inheritance;

import com.hilda.Modul2.Polimorfisme.Parent;

public class Child extends Parent {
    public int z = 7;

    public void getData(){
        System.out.println("data child: " + z );
    }
}
