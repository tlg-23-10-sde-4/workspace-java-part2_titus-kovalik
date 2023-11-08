/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import com.fastjava.annotation.Fast;

/**
 * TODO: all methods in this class should run 25% faster.
 */
//@Fast(boost = .25)
public class Employee {

    /**
     * TODO: this method needs to run 50% faster.
     * OSHA regulations require extra logging about the performance improvement,
     * as well as a description of why we're using this technology from FastJava.com.
     */
    //@Fast(boost = 0.50, log = true, description = "Employees need to work faster")
    public void work() {
        System.out.println("Employee working hard");
    }

    public void pay() {
        System.out.println("Employee paid well");
    }
}