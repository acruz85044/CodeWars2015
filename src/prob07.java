import java.util.*;
import java.io.*;

public class prob07 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob07.txt"));
		System.out.println();
		boolean stop = false;
		while(!stop)
		{
			double x = input.nextDouble();
			if (x == 0)
			{
				stop = true;
			}
			else
			{
				System.out.println(Math.pow(x * x, 1.0/3.0));
			}
		}
	}
}
