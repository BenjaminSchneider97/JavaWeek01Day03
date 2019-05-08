import java.util.Scanner;

public class Intermediate_A11 {

    public static String calcArea(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of one side of the triangle: ");
        int a = input.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int b = input.nextInt();

        double area = 0.5*a*b;

        String result = "The area of the triangle is: " + area + "!";

        return result;

    }

    public static void main(String[] args){

        System.out.println(calcArea());

    }

}
