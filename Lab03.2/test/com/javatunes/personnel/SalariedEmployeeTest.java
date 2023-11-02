package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    private SalariedEmployee emp;
    private SalariedEmployee emp2;

    @Before
    public void setUp() {
        emp = new SalariedEmployee("Patricia", Date.valueOf("2020-02-06"), 4500.0);
        emp2 = new SalariedEmployee("Patricia", Date.valueOf("2020-02-06"), 4500.0);

    }


    @Test
    public void hashCode_equalsObjectsMustHaveEqualHashCode() {
        assertEquals(emp.hashCode(), emp2.hashCode());
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameSalary_sameHiredate() {
        emp2.setName("DIFFERENT");
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHiredate_sameSalary() {
        emp2.setHireDate(Date.valueOf("2023-11-02"));
        assertNotEquals(emp, emp2);
    }

    @Test
    public void equals_shouldReturnFalse_SameName_sameHiredate_differentSalary() {
        emp2.setSalary(1000.0);
        assertNotEquals(emp, emp2);
//        assertFalse(emp.equals(emp2));
    }

    @Test
    public void equals_shouldReturnTrue_AllPropertiesSame() {
        assertEquals(emp, emp2); //this does an .equals() check
//        assertTrue(emp.equals(emp2)); // alternative assertion
    }

    @Test
    public void testPay() {
        assertEquals(4500.0, emp.pay(), .001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(1350.0, emp.payTaxes(), .001);
    }
}