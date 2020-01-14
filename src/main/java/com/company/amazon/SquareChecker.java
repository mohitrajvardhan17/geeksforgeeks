package com.company.amazon;

/*
Problem Statement:
How to check if given four points form a square
Given coordinates of four points in a plane, find if the four points form a square or not.
To check for square, we need to check for following.
a) All fours sides formed by points are the same.
b) The angle between any two sides is 90 degree. (This condition is required as Quadrilateral also has same sides.
c) Check both the diagonals have the same distance
*/

public class SquareChecker {

    public class Point {
        double x;
        double y;
    }

    private final Point p1, p2, p3, p4;

    SquareChecker(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
        return isLengthOfAllSideSame(p1, p2, p3, p4) &&
                isAllSideRightAngle(p1, p2, p3, p4) &&
                isDiagonalSizeEqual(p1, p2, p3, p4);
    }

    private static boolean isDiagonalSizeEqual(Point p1, Point p2, Point p3, Point p4) {
        return lengthOfSide(p1, p3) == lengthOfSide(p3, p4);
    }

    private static boolean isAllSideRightAngle(Point p1, Point p2, Point p3, Point p4) {
        //Todo: find better solution https://math.stackexchange.com/questions/1162601/determine-if-a-triangle-is-right-angled-with-only-coordinates
        return isTwoSideRightAngled(p1, p2, p3) &&
                isTwoSideRightAngled(p2, p3, p4) &&
                isTwoSideRightAngled(p3, p4, p1);
    }

    private static boolean isTwoSideRightAngled(Point p1, Point p2, Point p3) {
        return Math.pow(lengthOfSide(p1, p2), 2) + Math.pow(lengthOfSide(p2, p3), 2) == Math.pow(lengthOfSide(p1, p3)
                , 2);
    }

    private static boolean isLengthOfAllSideSame(Point p1, Point p2, Point p3, Point p4) {
        //Todo: find better solution https://stackoverflow.com/questions/5228383/how-do-i-find-the-distance-between-two-points
        return (lengthOfSide(p1, p2) == lengthOfSide(p2, p3) &&
                lengthOfSide(p2, p3) == lengthOfSide(p3, p4) &&
                lengthOfSide(p3, p4) == lengthOfSide(p4, p1));
    }

    private static double lengthOfSide(Point p1, Point p2) {
        double distPointX = p1.x - p2.x;
        double distPointY = p1.y - p2.y;
        return Math.sqrt((distPointX * distPointX) + (distPointY * distPointY));
    }
}
