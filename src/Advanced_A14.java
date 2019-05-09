import java.util.Scanner;

public class Advanced_A14 {

    private static String calcGrade(){

        Scanner input = new Scanner(System.in);

        String[] subjects = {"maths", "physics", "biology", "chemistry"};

        String result = "";

        for (String subject : subjects) {

            System.out.print("Enter the points for the subject \"" + subject + "\": ");
            int a = input.nextInt();

            String grade = "test";

            if (a >= 90) {
                grade = "A";
            } else if (a >= 80) {
                grade = "B";
            } else if (a >= 70) {
                grade = "C";
            } else if (a >= 60) {
                grade = "D";
            } else if (a >= 40) {
                grade = "E";
            } else if (a < 40) {
                grade = "F";
            }

            result += "Final grade in \"" + subject + "\": " + grade +"\n";

        }

        return result;

    }

    public static void main(String[] args){

        System.out.println(calcGrade());

    }
}
