public class Intermediate_A3 {

    public static void main(String[] args){

        String string = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, `and what is the use of a book,' thought Alice `without pictures or conversation?'";

        int a = string.indexOf("sister");

        System.out.println(a);

        System.out.println(string.startsWith("was",6));

        String x = "abc";
        String y = "def";
        String z = "asd";

        System.out.println(x.compareTo(z));

        String newstring = string.replace("Alice", "Simon");

        System.out.println(newstring);

        String newstring2 = string.replaceAll("of", "spongebob");

        System.out.println(newstring2);

        String[] splitstring = string.split("a");

    }
}
