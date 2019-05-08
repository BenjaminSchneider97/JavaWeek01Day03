import java.util.Scanner;

public class Intermediate_A10 {

    public static String calcAvg(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.print("Enter the third number: ");
        int c = input.nextInt();

        double avg = (a+b+c)/3;

        String result = "The average of " + a + ", " + b + " and " + c + " is: " + avg;

        return result;

    }

    public static void main(String[] args){

        System.out.println(calcAvg());

    }

}
