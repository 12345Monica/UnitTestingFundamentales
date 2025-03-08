package org.example.aplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {


    /*
    Diferenta dintre arrays.as.list () vs new ArrayList <>(Arrasy.asList()

     */

    public static String[] removeDuplicates(String[] imput) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(imput));
        System.out.println(set);
        return set.toArray(new String[0]);

    }
}
