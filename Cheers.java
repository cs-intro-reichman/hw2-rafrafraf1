// Prints a crowd cheering output.

import java.util.List;

public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int number = Integer.parseInt(args[1]);
            List<Character> nchars = List.of('A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X');
            String n;
            for (int i = 0; i < word.length(); i++) {
                char cha = word.charAt(i);
                n = "  ";
                if (nchars.contains(Character.toUpperCase(cha))) {
                        n = "n ";
                }
                System.out.println("Give me a" + n + cha +": " + cha + "!");
            }
            System.out.println("What does that spell?");
            for (int x = 0; x < number; x++) {
                System.out.println(word + "!!!");
            }
        }
}
