package com.javatunes.billing;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {

    //private static final Map<Location, TaxCalculator> calcMap = new HashMap<>();

    //THIS IS HOW TO MAKE A "CACHE" USING A MAP
    //THIS IS AN EAGER CACHE
    private static final Map<Location, TaxCalculator> calcMap = Map.of(
            Location.ONLINE, new OnlineTax(),
            Location.EUROPE, new EuropeTax(),
            Location.USA,    new USATax()
    );

    public TaxCalculatorFactory() {
    }
    //THIS IS HOW TO MAKE A "CACHE" USING A MAP
    //THIS IS A LAZY CACHE
    public static TaxCalculator getTaxCalculator(Location location) {
//        if (!calcMap.containsKey(location)) {
//            switch (location) {
//                case USA:
//                    calcMap.put(location, new USATax());
//                    break;
//                case ONLINE:
//                    calcMap.put(location, new OnlineTax());
//                    break;
//                case EUROPE:
//                    calcMap.put(location, new EuropeTax());
//            }
//        }
        return calcMap.get(location);
    }
}