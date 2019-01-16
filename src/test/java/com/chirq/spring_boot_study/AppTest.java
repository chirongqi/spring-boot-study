package com.chirq.spring_boot_study;

import com.chirq.study.VisualAccmulator;

import edu.princeton.cs.algs4.StdRandom;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public static void main(String[] args) {
        int T = 1000;
        VisualAccmulator a = new VisualAccmulator(T, 1.0);

        for (int i = 0; i < T; i++)
            a.addDateValue(StdRandom.random());

        System.out.println(a);
    }
}
