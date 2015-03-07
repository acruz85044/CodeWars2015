import java.util.*;
import java.io.*;

public class prob06 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob06.txt"));
		System.out.println();
		int l = input.nextInt();
		int w = input.nextInt();
		int d = input.nextInt();
		System.out.println((int) Math.ceil((1.0 * l * w * d / 27)));
	}
}
