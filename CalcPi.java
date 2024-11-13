// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int to = Integer.parseInt(args[0]);
		double flipper = 4;
		double divisor = 1;
		double pi = 0;
		for (int i=0; i<to; i++) {
			pi = pi + flipper/divisor;
			flipper = -flipper;
			divisor += 2;
		}
		System.out.println("pi according to Java: " + Math.PI + "\npi, approximated:    " + pi);
	}
}