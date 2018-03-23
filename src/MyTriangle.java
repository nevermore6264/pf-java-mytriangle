import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1 : ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side2 : ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side3 : ");
        double side3 = scanner.nextDouble();
        if (isValid(side1, side2, side3) == true) {
            System.out.println("This area : " + calcArea(side1, side2, side3));
        }else{
            System.out.println("Input is not correct ! ");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }

    public static double calcArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        double area = p * (p - side1) * (p - side2) * (p - side3);
        return Math.sqrt(area);
    }

}
