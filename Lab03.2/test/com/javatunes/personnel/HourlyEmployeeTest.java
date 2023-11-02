package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("BiggieCheese", Date.valueOf("1856-01-02"), 2.0, 30.0);
    }

    @Test
    public void testPay() {
        assertEquals(60, emp.pay(),.001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(15, emp.payTaxes(), .001);
    }
}