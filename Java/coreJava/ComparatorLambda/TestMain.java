package com.abfl.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestMain {



    public static void main(String[] args) {
        List<Employ> lstOfEmploy=new ArrayList<Employ>();
        lstOfEmploy.add(Employ.builder().age(19).salary(102.5).name(null).city(null).build());
        lstOfEmploy.add(Employ.builder().age(11).salary(22.5).name("an").city("a").build());
        lstOfEmploy.add(Employ.builder().age(12).salary(32.5).name("bn").city("b").build());
        lstOfEmploy.add(Employ.builder().age(13).salary(42.5).name("cn").city("c").build());

        lstOfEmploy.add(Employ.builder().age(17).salary(82.5).name("hn").city("g").build());
        lstOfEmploy.add(Employ.builder().age(18).salary(92.5).name("kn").city("h").build());
        lstOfEmploy.add(Employ.builder().age(19).salary(102.5).name("tn").city("i").build());

        lstOfEmploy.add(Employ.builder().age(19).salary(102.5).name(null).city(null).build());
        lstOfEmploy.add(Employ.builder().age(19).salary(102.5).name(null).city(null).build());

        lstOfEmploy.add(Employ.builder().age(14).salary(52.5).name("dn").city("d").build());
        lstOfEmploy.add(Employ.builder().age(15).salary(62.5).name("en").city("e").build());
        lstOfEmploy.add(Employ.builder().age(16).salary(72.5).name("fn").city("f").build());
        lstOfEmploy.add(Employ.builder().age(19).salary(102.5).name(null).city(null).build());


        Comparator<Employ> byName =(Employ e1, Employ e2)->
        {
            if (e1.getName() == null && e2.getName() == null) {
                return 0;
            } else if(e1.getName() == null) {
                return -1;
            } else if(e2.getName() == null) {
                return 1;
            } else {
                return e1.getName().compareTo(e2.getName());
            }
        };

        lstOfEmploy.stream().sorted(byName).forEach(d->{
            System.out.println("d."+d.toString());
        });



    }



}
