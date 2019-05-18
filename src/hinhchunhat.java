
import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        double width, hight;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao width");
        width = input.nextDouble();
        System.out.println("Nhap vao height");
        hight = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, hight);
        System.out.println("Ve duong tron \n" + rectangle.display() );

        System.out.println("Dien tich : " + rectangle.getArea());

        System.out.println("Chu vi : " + rectangle.getPerimeter());
    }
}
