
import java.util.Scanner;

public class Assignment_3_6 {
    public static void main (String[] args)
    {
        double weight, feet, inches;
        double bmi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = scan.nextDouble();
        System.out.println("Enter feet: ");
        feet = scan.nextDouble();
        System.out.println("Enter inches: ");
        inches = scan.nextDouble();

        inches = inches + feet * 12;
        bmi = (weight / (inches * inches)) * 703;

        System.out.println("BMI is " + bmi);

        if (bmi < 19)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else if (bmi < 40)
            System.out.println("Obese");
        else
            System.out.println("Morbidly obese");
    }
}
