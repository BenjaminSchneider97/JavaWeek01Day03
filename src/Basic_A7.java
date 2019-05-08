import java.util.Scanner;

public class Basic_A7 {

    public static String calcCircleArea (){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius ");
        int r = input.nextInt();

        double calc = Math.PI * Math.pow(r, 2);

        String result = ("The area of the circle equals: " + calc);

        return result;
    }

    public static void main(String[] args){

        System.out.println(calcCircleArea());



    }
}
