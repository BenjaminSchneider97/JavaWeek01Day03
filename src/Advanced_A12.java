import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Advanced_A12 {

    public static String calcAnniversaries(){


        Calendar currentYear = new GregorianCalendar();

        int y = currentYear.get(Calendar.YEAR);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year of the wedding ");
        int b = input.nextInt();

        int anniversaries = 1;

        int difference = y - b;

        anniversaries = (difference*anniversaries)/4;

        String result = "Anniversary count: " + anniversaries;

        return result;

    }

    public static void main(String[] args){

        System.out.println(calcAnniversaries());

    }

}
