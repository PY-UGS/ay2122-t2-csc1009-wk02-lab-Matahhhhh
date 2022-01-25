import java.util.Scanner;

public class Lab2q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int animal_year = year % 12;
        String[] animal = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon",
        "snake","horse","sheep"};
        System.out.println(animal[animal_year]);

    }    
}
