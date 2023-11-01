package com.entertainment.client;

import com.entertainment.Television;

import java.util.Comparator;

class TelevisionBrandChannelComparator implements Comparator<Television> {

    @Override
    public int compare(Television tv1, Television tv2) {
       int result = tv1.getBrand().compareTo(tv2.getBrand());

       if (result == 0) {
           result = Double.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
       }
       return result;
    }
}
