import java.util.Scanner;

public class Basic_A6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int a = input.nextInt();

        System.out.println("Is it Celsuis or Farenheit (c/f)?: ");
        String b = input.nextLine();

        if (b.equals("c")){
            int c = a*9/5+32;
            System.out.println(a + " celsius equals " + c + " fahrenheit!");
        } else if (b.equals("f")){
            int c = (a-32)*5/9;
            System.out.println(a + " fahrenheit equals " + c + " celsius!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
