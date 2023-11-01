/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
         //testFindById();
        // testFindByKeyword();
         //testFindByCategory();
         //testSize();
         //testGetAll();

        //Task method tests
        //testFindSelfTitled();
        //testFindCheapRock();
        //testGenreFinder();
        //testFindAverage();
        //testHasGenre();
        testGenreAvrg(MusicCategory.POP);
    }

    private static void testGenreAvrg(MusicCategory Pop) {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println("The average price in this genre is: " + MusicCategory.POP);
    }

    private static void testHasGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        boolean hasBlues = catalog.hasGenre(MusicCategory.BLUES);
        System.out.println(hasBlues);

        boolean hasJazz = catalog.hasGenre(MusicCategory.JAZZ);
        System.out.println(hasJazz);
    }

    private static void testFindAverage() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println("The average price is: " + catalog.averagePrice());
    }

    private static void testGenreFinder() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        dump(catalog.genreFinder(MusicCategory.POP));
    }

    private static void testFindCheapRock() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        dump(catalog.findCheapRock(14));
    }

    private static void testFindSelfTitled() {
        //todo
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(20l);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        dump(popItems);
    }



    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> allItems = catalog.getAll();

    }

    // helper method to show collection vertically
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}