import ra.Circle;
import ra.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập bán kính: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println(" Mời bạn nhập chiều cao: ");
        double height = Double.parseDouble(sc.nextLine());
        Circle circle = new Circle(radius);
        Cylinder cylinder =new Cylinder(radius,height);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}