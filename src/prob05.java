import java.util.*;
import java.io.*;


public class prob05 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob05.txt"));
		System.out.println();
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println(a + " x (" + b + " + " + c + ") = " + a + " x " + b +  " + " + a + " x " + c);
		System.out.println(a + " x " + (b + c) + " = " + (a * b) + " + " + (a * c));
		System.out.println((a * (b + c)) + " = " + (a * (b + c))); 
	}
}
