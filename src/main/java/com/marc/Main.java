package com.marc;

import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                p.setLocation(i,j);
                System.out.print("#");
            }
            System.out.println();
        }
    }

}
