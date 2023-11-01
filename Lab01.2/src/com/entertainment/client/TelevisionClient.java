package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TelevisionClient {
    public static void main(String[] args) {

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("LG", 55);
        Television tvD = new Television("Samsung", 40);

        System.out.println("tva==tvb: " + (tvA==tvB));
        System.out.println("tva.equals(tvb): " + tvA.equals(tvB));
        System.out.println();

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as a duplicate
        tvs.add(tvC);
        tvs.add(tvD);

        System.out.println("The size of the set is: " + tvs.size());
    }
}