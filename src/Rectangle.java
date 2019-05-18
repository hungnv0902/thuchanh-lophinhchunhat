public class Rectangle {
    double width, hight;
    public Rectangle() {

    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;

    }

    public double getArea() {
        double area = this.hight*this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.hight + this.width)*2;
        return  perimeter;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + hight + "}";
    }
}
