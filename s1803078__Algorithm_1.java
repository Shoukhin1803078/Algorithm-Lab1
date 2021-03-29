package algorithm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;

public class s1803078__Algorithm_1 {

	static int count = 0;

	static int Fibo_function(int n) {
		int a[] = new int[n];
		count++;
		if (n <= 2) {
			count++;
			if (n == 1) {
				count++;
				a[0] = 0;
				count++;
				System.out.print("Fibonacci series :"+a[0]);
			} else {
				a[0] = 0;
				a[1] = 1;
				count += 3;
				System.out.print("Fibonacci series :"+a[0]+" "+a[1]);
			}
		} else {
			a[0] = 0;
			a[1] = 1;
			count += 3;
			for (int i = 2; i < n; i++) {
				count++;
				a[i]=a[i-1]+a[i-2];
				count++;
			}
			count++;
			System.out.print("Fibonacci series :");
			for(int i=0;i<n;i++){System.out.print(a[i]+" ");}
			count+=n;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);

		try {
			File f = new File("fibonacci.txt");
			Scanner ob1 = new Scanner(f);
			while (ob1.hasNext()) {
				int n = Integer.valueOf(ob1.next());
				System.out.println("For n=" + n);
				System.out.println("\nThe number of step needed :" + Fibo_function(n));
				//System.out.println();
			}
		} catch (Exception e) {
			System.out.println("MariaYana Amin Jumi is the main Exception.Solve that real problem.");
		}
	}
}
