package com.javatunes.billing;

public class TaxCalculatorFactory {

    public TaxCalculatorFactory() {
    }
    /*
     * Consider implementing a "cache" of TaxCalculator objects.
     *
     * If I have not previously created the object (e.g. USATax) then
     * I'll create it here (with "new") add it to my cache, and then return it.
     *
     * However, if my cache already contains it, then I just fetch it
     * from the cache and return it - no need to create another one.
     *
     * Hint: you could use a simple Map<Location, TacCalculator> for the cache
     * it would be a three row map, each row has a location | TaxCalculator
     */

    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;

        switch (location) {
            case USA:
                calc = new USATax();
                break;
            case ONLINE:
                calc = new OnlineTax();
                break;
            case EUROPE:
                calc = new EuropeTax();
        }
        return calc;
    }
}