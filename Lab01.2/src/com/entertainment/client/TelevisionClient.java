package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {

        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);

        tv1.changeChannel(9);
        System.out.println(tv1);
        System.out.println(tv2);

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);

        System.out.println("tva==tvb: " + (tvA==tvB));
        System.out.println("tva.equals(tvb): " + tvA.equals(tvB));
    }
}