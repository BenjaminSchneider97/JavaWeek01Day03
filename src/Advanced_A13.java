import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Advanced_A13 {

    public static String calcInsurance(){

        double base = 500;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = input.nextInt();

        System.out.print("Enter car brand: ");
        String b = input.next();

        System.out.print("Enter your kW: ");
        int c = input.nextInt();

        if(a < 25){
           base = base + base * 0.2;
        } else if (a > 65){
            base = base + base * 0.15;
        }

        if(b.equals("Mercedes") || b.equals("BMW") || b.equals("Ferrari")) {
            base = base + base  * 0.2;
        }

        if(c < 50) {
            base = base - 100;
        } else if (c > 75) {
            base = base + base * (c - 75) / 200;
        }

        String result = "Your insurance base is: " + base;

        return result;
    }

    public static void main(String[] args){

        System.out.println(calcInsurance());

    }

}
