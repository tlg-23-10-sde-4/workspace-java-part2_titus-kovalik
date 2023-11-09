package org.veggie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class RadishSortTestLambda {

    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 2.1, 1.0, 0));
        radishes.add(new Radish("black", 1.0, 0, 3));
        radishes.add(new Radish("red", 2.5, 4.2, 0));
        radishes.add(new Radish("pink", 0.7, 3.2, 2));

        // original order
        System.out.println("Original order");

        System.out.println();

        System.out.println("Tail Length");
        radishes.sort((r1, r2) -> Double.compare(r1.getTailSize(), r2.getTailSize()) );
        dump(radishes);

        System.out.println("sprouts");
        radishes.sort((r1, r2) -> Integer.compare(r1.getSprouts(), r2.getSprouts()));
        dump(radishes);

        System.out.println("color, alphabetically");
        radishes.sort((r1, r2) -> r1.getColor().compareTo(r2.getColor()));
    }

    private static void dump(List<Radish> radishes) {
        for (Radish radish : radishes) {
            System.out.println(radish);
            System.out.println();
        }
    }
}