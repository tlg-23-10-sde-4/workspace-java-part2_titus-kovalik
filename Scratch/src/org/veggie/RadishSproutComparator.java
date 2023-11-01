package org.veggie;

import java.util.Comparator;

class RadishSproutComparator implements Comparator<Radish> {
    @Override
    public int compare(Radish r1, Radish r2) {
        return Integer.compare(r1.getSprouts(), r2.getSprouts());
    }
}