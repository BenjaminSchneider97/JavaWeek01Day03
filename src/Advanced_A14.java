import java.util.Scanner;

public class Advanced_A14 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers for the subject physics: ");
        int physics = input.nextInt();

        System.out.print("Enter the numbers for the subject chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter the numbers for the subject biology: ");
        int biology = input.nextInt();

        System.out.print("Enter the numbers for the subject mathematics: ");
        int mathematics = input.nextInt();

        System.out.print("Enter the numbers for the subject computer: ");
        int computer = input.nextInt();

        if(physics >= 90){

            String grade = "A";
            System.out.println("Final grade in Physics: " + grade);

        } else if (physics >= 80){

            String grade = "B";
            System.out.println("Final grade in Physics: " + grade);

        } else if (physics >= 70){

            String grade = "C";
            System.out.println("Final grade in Physics: " + grade);

        } else if (physics >= 60){

            String grade = "D";
            System.out.println("Final grade in Physics: " + grade);

        } else if (physics >= 40){

            String grade = "E";
            System.out.println("Final grade in Physics: " + grade);

        } else if (physics < 40){

            String grade = "F";
            System.out.println("Final grade in Physics: " + grade);
        }

        if(chemistry >= 90){

            String grade = "A";
            System.out.println("Final grade in chemistry: " + grade);

        } else if (chemistry >= 80){

            String grade = "B";
            System.out.println("Final grade in chemistry: " + grade);

        } else if (chemistry >= 70){

            String grade = "C";
            System.out.println("Final grade in chemistry: " + grade);

        } else if (chemistry >= 60){

            String grade = "D";
            System.out.println("Final grade in chemistry: " + grade);

        } else if (chemistry >= 40){

            String grade = "E";
            System.out.println("Final grade in chemistry: " + grade);

        } else if (chemistry < 40) {

            String grade = "F";
            System.out.println("Final grade in chemistry: " + grade);
        }
    }
}
