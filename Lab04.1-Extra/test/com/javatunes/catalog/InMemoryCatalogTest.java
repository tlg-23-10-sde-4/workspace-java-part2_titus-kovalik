package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findById_shouldReturnNull_IdNotFound() {
        MusicItem item = catalog.findById(19L);

        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItem_IdIsFound() {
        MusicItem item = catalog.findById(1L);

        assertEquals(1L, (long) item.getId());
        //assertEquals(1L, item.getId().longValue()); <--- also works
    }

    @Test
    public void findByCategory_shouldReturnEmptyCollection_categoryNotFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.JAZZ);

        //assertEquals(0, items.size()); <--- also works for Collection types
        assertTrue(items.isEmpty());
    }

    @Test
    public void findByCategory_shouldReturnCollection_categoryFound() {
        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        assertEquals(4, items.size());

        for (MusicItem item: items) {
            //assertTrue(MusicCategory.POP == item.getMusicCategory()); <--- also works
            //assertEquals(MusicCategory.POP, item.getMusicCategory()); <--- also works
            assertSame(MusicCategory.POP, item.getMusicCategory());
        }
    }

    @Test
    public void findSelfTitled_shouldReturnCollection_artistSameAsTitle() {
        Collection<MusicItem> items = catalog.findSelfTitled();

        assertEquals(2, items.size());

        for (MusicItem item : items) {
            //assertTrue(item.getArtist().equals(item.getTitle())); <--- also works
            assertEquals(item.getArtist(), item.getTitle());
        }
    }

    @Test
    public void genreFinder_shouldReturnCorrectResult() {
        Collection<MusicItem> result = catalog.genreFinder(MusicCategory.POP);
        assertEquals(4, result.size());
    }
}