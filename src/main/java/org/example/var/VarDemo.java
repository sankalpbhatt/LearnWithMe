package org.example.var;

import java.util.ArrayList;
import java.util.HashMap;

public class VarDemo {

    public static void main(String [] a){
        var name = "Ram";
        System.out.println(name.getClass());

        var list = new ArrayList<String>();
        System.out.println(list.getClass());

        var map = new HashMap<String, String >();
        System.out.println(map.getClass());
    }
}
