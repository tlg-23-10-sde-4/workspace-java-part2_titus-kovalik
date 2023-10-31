package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);

        System.out.println("tva==tvb: " + (tvA==tvB));
        System.out.println("tva.equals(tvb): " + tvA.equals(tvB));
        System.out.println();

//        System.out.println(tvA.hashCode()); //796533847
//        System.out.println(tvB.hashCode()); //1449621165
//        System.out.println();

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as a duplicate
        System.out.println("The size of the set is: " + tvs.size());

    }
}