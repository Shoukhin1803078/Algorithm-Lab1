package algorithm;

import java.io.File;
import java.util.Scanner;

public class s1803078__Algorithm_2 {

	static long count = 0;

	public static long fibo_function(long n) {
		if (n <= 1) {
			count++;
			return n;
		}
		count+=3;
		return fibo_function(n - 2) + fibo_function(n - 1);
	}

	public static void main(String args[]) {
		try {
			File f = new File("fibonacci.txt");
			Scanner ob = new Scanner(f);
			while (ob.hasNext()) {
				String s = ob.nextLine();
				long n = Long.valueOf(s);
				System.out.print("For n=" + n + "\nFibonacci series :");
				for (int i = 0; i < n; i++) {
					System.out.print( fibo_function(i) + " ");
				}
				//System.out.println();
				System.out.println("\nNumber of step :"+count);
			}
		} catch (Exception e) {
			System.out.println("Mariya Amin Jumi is the main Exception . Solve that real problem .");
		}

	}
}
