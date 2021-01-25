package com.marc;

import java.awt.Point;

public class Main {

    public static void main(String[] args) {
        Point p = new Point();
        Point block = new Point(4,25);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 40; j++) {
                p.setLocation(i,j);
                System.out.print("#");
                if(p.equals(block))
                    System.out.print("U");
            }
            System.out.println();
        }
    }

}
