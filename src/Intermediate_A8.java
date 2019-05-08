import java.util.Scanner;

public class Intermediate_A8 {

    public static String calcBMI (){

        Scanner input = new Scanner(System.in);

        System.out.print("Input your weight in kg: ");
        double kg = input.nextDouble();

        System.out.print("Input your height in cm: ");
        double height = input.nextDouble();

        double bmi = (kg/height/height)*10000;

        String result = ("Your BMI is: " + bmi);

        return result;
    }

    public static void main(String[] args){

        System.out.println(calcBMI());

    }
}