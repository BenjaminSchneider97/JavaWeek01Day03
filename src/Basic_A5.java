import java.util.Scanner;

public class Basic_A5 {

    public static String calc () {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter elevator capacity: ");
        int a = input.nextInt();

        System.out.println("Enter average persons weight: ");
        int b = input.nextInt();

        int calculation = a / b;

        String output = "You can fit " + calculation + " in this elevator";

        return output;
    }



    public static void main(String[] args) {



        System.out.println(calc());




    }
}
