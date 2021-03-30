package lesson7.lesson71;

public class Rectangle {
    private int width;
    private int heaight;

//    public Rectangle(int width, int heaight) {
//        this.width = width;
//        this.heaight = heaight;
//    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeaight() {
        return heaight;
    }

    public void setHeaight(int heaight) {
        this.heaight = heaight;
    }

    public int getPerimeter() {
        return (width + heaight) * 2;
    }

    public int getArea() {
        return width * heaight;

    }

    public String checkSquare() {
        if (width == heaight) {
            return "Đây là hình vuông";
        } else
            return "Đây là hình chữ nh";
    }

    public void xuat() {
        System.out.println("Width: " + width);
        System.out.println("Heaight: " + heaight);
    }

}
