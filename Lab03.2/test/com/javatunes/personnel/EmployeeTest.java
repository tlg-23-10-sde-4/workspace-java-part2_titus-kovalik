package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;
    
    @Before
    public void setUp() {
        emp1 = new SalariedEmployee("Mary Lou", Date.valueOf("1999-09-09"));
        emp2 = new SalariedEmployee("Mary Lou", Date.valueOf("1999-09-09"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHiredate() {
        emp2.setName("James");
        assertNotEquals(emp1,emp2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHiredate() {
        emp2.setHireDate(Date.valueOf("2000-02-02"));
        assertNotEquals(emp1,emp2);
    }


    @Test
    public void shouldRReturnTrue_allPropertiesSame() {
        assertEquals(emp1,emp2);
    }
}