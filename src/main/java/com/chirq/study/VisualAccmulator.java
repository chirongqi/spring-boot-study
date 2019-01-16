package com.chirq.study;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class VisualAccmulator {
    private double tatol;

    private int N;

    public VisualAccmulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDateValue(double val) {
        N++;
        tatol += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, tatol / N);
    }

    public double mean() {
        return tatol / N;
    }

    @Override
    public String toString() {
        return "VisualAccmulator [tatol=" + tatol + ", N=" + N + "]";
    }

}

class Test {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccmulator a = new VisualAccmulator(T, 1.0);

        for (int i = 0; i < T; i++)
            a.addDateValue(StdRandom.random());

        System.out.println(a);
    }
}
