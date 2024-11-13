// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int finalSeed = Integer.parseInt(args[0]);
		Boolean concise = true;
		if (args[1].charAt(0) == 'v') {
			concise = false;
		}
		int currNum;
		int counter;
		for (int i = 1; i < finalSeed+1; i++) {
			currNum = i;
			counter = 1;
			if (currNum == 1) {
				currNum = 4;
				counter++;
				if (!concise) {
					System.out.print("1 ");
				}
			}
			while (currNum != 1) {
				if (!concise) {
					System.out.print(currNum + " ");
					counter++;
				}
				if (currNum % 2 == 0) { // even
					currNum = currNum / 2;
				}
				else {
					currNum = (currNum*3) + 1;
				}
			}
			if (!concise) {
				System.out.print("1 (" + counter + ")\n");
			}
		}
		System.out.println("Every one of the first " + finalSeed + " hailstone sequences reached 1.");

	}
}
