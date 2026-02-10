import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum (int a, int b) {
		return a+b;
	}

	public static int difference (int a, int b) {
		return a-b;
	}
	
	public static double product (double a, double b) {
		return a*b;
	}

	public static String removeFirst (String a) {
		return a.substring(1);
	}

	public static int combinedLength (String a, String b) {
		return a.length() + b.length();
	}

	public static boolean isEven (int a) {
		return Math.abs(a%2)==0;
	}

	public static boolean isOdd (int a) {
		return Math.abs(a%2)==1;
	}

	public static boolean isPositive (int a) {
		return a>0;
	}

	public static boolean isNegative (int a) {
		return a<0;
	}
}
