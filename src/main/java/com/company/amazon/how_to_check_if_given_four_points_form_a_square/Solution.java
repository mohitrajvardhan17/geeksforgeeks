package com.company.amazon.how_to_check_if_given_four_points_form_a_square;

/*
https://softwareengineering.stackexchange.com/questions/176938/how-to-check-if-4-points-form-a-square
 */
public class Solution {
    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

     private static double getLineLengh(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + ((p1.y - p2.y) * (p1.y - p2.y)));
    }

    public static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        if (p1 == null || p2 == null || p3 == null || p4 == null) {
            return false;
        }
        double distSideOne = getLineLengh(p1, p2);
        double distSideTwo = getLineLengh(p1, p3);
        double distSideThree = getLineLengh(p1, p4);

        if (distSideOne == distSideTwo) {
            if (getLineLengh(p2, p4) == getLineLengh(p3, p4)) {
                if (getLineLengh(p1, p4) == getLineLengh(p2, p3)) {
                    return true;
                }
            }
        } else if (distSideOne == distSideThree) {
            if (getLineLengh(p2, p3) == getLineLengh(p4, p3)) {
                if (getLineLengh(p1, p3) == getLineLengh(p2, p4)) {
                    return true;
                }
            }
        } else  if (distSideTwo == distSideThree) {
            if (getLineLengh(p3, p2) == getLineLengh(p4, p2)) {
                if (getLineLengh(p1, p2) == getLineLengh(p3, p4)) {
                    return true;
                }
            }
        }
        return false;
    }
}
