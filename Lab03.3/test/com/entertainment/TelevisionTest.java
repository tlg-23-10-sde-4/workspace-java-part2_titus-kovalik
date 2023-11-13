package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest{
    private Television tv;
    private Television tv1;
    @Before
    public void setUp() {
        tv = new Television();
        tv1 = new Television();
    }



    @Test
    public void compareTo_shouldNotSortByBrand_byBrandNaturalOrder() {
        tv.setBrand("Sony");
        tv1.setBrand("LG");
        assertEquals(7, tv.compareTo(tv1));
    }

    @Test
    public void compareTo_shouldSortByBrand_byBrandNaturalOrder() {
        tv1.setBrand("LG");
        tv.setBrand("LG");
        assertEquals(0, tv.compareTo(tv1));
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrow_InvalidChannelException_invalid_upperBound() throws InvalidChannelException {
        tv.changeChannel(1000);
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrow_InvalidChannelException_invalid_lowerBound() throws InvalidChannelException {
        tv.changeChannel(0);
    }

    @Test
    public void changeChannel_shouldStoreValue_valid_upperBound() throws InvalidChannelException {
        tv.changeChannel(999);
        assertEquals(999, tv.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_valid_lowerBound() throws InvalidChannelException {
        tv.changeChannel(1);
        assertEquals(1, tv.getCurrentChannel());
    }

    @Test
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
        try {
            tv.setVolume(101);
            fail("Should have thrown IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            String expected = "Invalid volume: 101. Allowed range: [0,100].";
            assertEquals(expected, e.getMessage());
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreVolume_ifValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_lowerBound() {

        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }
}