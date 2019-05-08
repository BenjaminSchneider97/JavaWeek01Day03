import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Intermediate_A9 {

    public static String calcAge (){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year you were born: ");
        int b = input.nextInt();
/*
        System.out.println("Enter the month you were born: ");
        int c = input.nextInt();

        System.out.println("Enter the day you were born: ");
        int d = input.nextInt();

        System.out.println("Enter the hour you were born: ");
        int e = input.nextInt();

        System.out.println("Enter the minute you were born: ");
        int f = input.nextInt();

        System.out.println("Enter the second you were born: ");
        int g = input.nextInt();

*/



        Date currentDate = new Date().getYear();

        System.out.println(currentDate);

        int calcAge = currentDate - b;


        String result = "Your age equals";

        return result;
    }

    public static void main(String[] args){

        System.out.println(calcAge());



    }
}
