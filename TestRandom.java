// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		int countPos = 0;
		int countNeg = 0;
		for (int i=0; i<n; i++) {
			if (Math.random() > 0.5) {
				countPos++;
			}
			else {
				countNeg++;
			}
		}
		System.out.println("> 0.5: " + countPos + "\n=< 0.5: " + countNeg);
		if (countPos > 0 && countNeg > 0) {
			double ratio = (double) (countPos) / (double) (countNeg);
			System.out.println("Ratio: " + ratio);
		}
		
	}
}
