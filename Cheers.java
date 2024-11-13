// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int number = Integer.parseInt(args[1]);
            for (int i = 0; i < word.length(); i++) {
                char cha = word.charAt(i);
                System.out.println("Give me an " + cha +": " + cha + "!");
            }
            System.out.println("What does that spell?");
            for (int x = 0; x < number; x++) {
                System.out.println(word + "!!!");
            }
        }
}
