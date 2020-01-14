package com.company.amazon;

/*
https://www.geeksforgeeks.org/find-two-rectangles-overlap/
Problem Statement:
Find if two rectangles overlap
Given two rectangles, find if the given two rectangles overlap or not.
Note that a rectangle can be represented by two coordinates, top left and bottom right. So mainly we are given following four coordinates.
l1: Top Left coordinate of first rectangle.
r1: Bottom Right coordinate of first rectangle.
l2: Top Left coordinate of second rectangle.
r2: Bottom Right coordinate of second rectangle.
rectanglesOverlap
We need to write a function bool doOverlap(l1, r1, l2, r2) that returns true if the two given rectangles overlap.
*/

public class RectangleOverlaps {

    private final Point topLeftRectangleOne;
    private final Point bottomRightRectangleOne;
    private final Point topLeftRectangleTwo;
    private final Point bottomRightRectangleTwo;

    public RectangleOverlaps(Point topLeftRectangleOne,
                             Point bottomRightRectangleOne,
                             Point topLeftRectangleTwo,
                             Point bottomRightRectangleTwo) {
        this.topLeftRectangleOne = topLeftRectangleOne;
        this.bottomRightRectangleOne = bottomRightRectangleOne;
        this.topLeftRectangleTwo = topLeftRectangleTwo;
        this.bottomRightRectangleTwo = bottomRightRectangleTwo;
    }

    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public class Rectangle {
        private final Point p1;
        private final Point p2;
        private final Point p3;
        private final Point p4;

        public Rectangle(Point p1, Point p2, Point p3, Point p4) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
            this.p4 = p4;
        }

        public Point getP1() {
            return p1;
        }

        public Point getP2() {
            return p2;
        }

        public Point getP3() {
            return p3;
        }

        public Point getP4() {
            return p4;
        }
    }

    //Todo: find better solution
    public boolean rectanglesOverlap() {
        Rectangle rectangleOne = new Rectangle(this.topLeftRectangleOne,
                                               new Point(this.topLeftRectangleOne.x, this.bottomRightRectangleOne.y),
                                               this.bottomRightRectangleOne,
                                               new Point(this.bottomRightRectangleOne.x, this.topLeftRectangleOne.y));
        Rectangle rectangleTwo = new Rectangle(this.topLeftRectangleTwo,
                                               new Point(this.topLeftRectangleTwo.x, this.bottomRightRectangleTwo.y),
                                               this.bottomRightRectangleTwo,
                                               new Point(this.bottomRightRectangleTwo.x, this.topLeftRectangleTwo.y));
        return rectanglesOverlap(rectangleOne, rectangleTwo);
    }

    private boolean rectanglesOverlap(Rectangle rectangleOne, Rectangle rectangleTwo) {
        if (isPointInsideRectangle(rectangleOne.p1, rectangleTwo)) {
            return true;
        }
        if (isPointInsideRectangle(rectangleOne.p2, rectangleTwo)) {
            return true;
        }
        if (isPointInsideRectangle(rectangleOne.p3, rectangleTwo)) {
            return true;
        }
        if (isPointInsideRectangle(rectangleOne.p4, rectangleTwo)) {
            return true;
        }
        return false;
    }

    private boolean isPointInsideRectangle(Point p1, Rectangle rectangleTwo) {
        if (rectangleTwo.getP1().getX() <= p1.getX() &&
                rectangleTwo.getP3().getX() >= p1.getX() &&
                rectangleTwo.getP1().getY() >= p1.getY() &&
                rectangleTwo.getP3().getY() <= p1.getY()) {
            return true;
        }
        return false;
    }

}
