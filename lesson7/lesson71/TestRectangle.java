package lesson7.lesson71;

import lesson7.lesson71.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeaight(12);
        rectangle.setWidth(2);
        System.out.println("Cv: " + rectangle.getPerimeter());
        System.out.println("S: " + rectangle.getArea());
        System.out.println("Width: " + rectangle.getWidth() + "  Heaight: " + rectangle.getHeaight());
        System.out.println(rectangle.checkSquare());

    }

}
