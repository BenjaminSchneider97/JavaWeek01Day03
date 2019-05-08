import java.util.Scanner;

public class Advanced_A4 {

    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fname = input.nextLine();

        System.out.println("Enter your last name: ");
        String lname = input.nextLine();

        String sfname = fname.substring(0, 1);
        String slname = lname.substring(0, 1);

        System.out.println("Hello " + sfname + "." + slname + ".");

        */

        Scanner name = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String fullname = name.nextLine();

        String[] splitname = fullname.split(" ");

        System.out.println("Hello " + splitname[0].substring(0, 1) + "." + splitname[1].substring(0, 1) + ".");

    }
}
