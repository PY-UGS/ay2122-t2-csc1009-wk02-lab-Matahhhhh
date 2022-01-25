import java.util.Scanner;

public class Lab2q1{

    static double PI = 3.14159;

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for radius: ");
        double radius = input.nextDouble();

        double circle_area = radius * radius * PI;

        String result = String.format("%.7f", circle_area);
        System.out.println("The area of the circle of radius " + radius + " is " + result);

    }
}