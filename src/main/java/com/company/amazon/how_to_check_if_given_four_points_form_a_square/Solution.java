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

    private static Boolean isRightAngle(Point p1, Point p2) {
        return false;
    }

    private static double pointDiff(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + ((p1.y - p2.y) * (p1.y - p2.y)));
    }

    public static boolean checkSquare(Point p1, Point p2, Point p3, Point p4) {
        if (p1 == null || p2 == null || p3 == null || p4 == null) {
            return false;
        }
        double distSideOne = pointDiff(p1, p2);
        double distSideTwo = pointDiff(p1, p3);
        double distSideThree = pointDiff(p1, p4);

        if (distSideOne == distSideTwo) {
            if (pointDiff(p2, p4) == pointDiff(p3, p4)) {
                if (pointDiff(p1, p4) == pointDiff(p2, p3)) {
                    return true;
                }
            }
        } else if (distSideOne == distSideThree) {
            if (pointDiff(p2, p3) == pointDiff(p4, p3)) {
                if (pointDiff(p1, p3) == pointDiff(p2, p4)) {
                    return true;
                }
            }
        } else  if (distSideTwo == distSideThree) {
            if (pointDiff(p3, p2) == pointDiff(p4, p2)) {
                if (pointDiff(p1, p2) == pointDiff(p3, p4)) {
                    return true;
                }
            }
        }
        return false;
    }
}
