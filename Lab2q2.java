import java.util.Scanner;

public class Lab2q2 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter three numbers:");
    float user_input_num = input.nextFloat();
    float user_input_num1 = input.nextFloat();
    float user_input_num2 = input.nextFloat();

    float average = (user_input_num + user_input_num1 + user_input_num2) / 3;
    System.out.println("The average of "+ user_input_num + " " + user_input_num1 + " " + 
    user_input_num2 + " is " + average);
    }
}
