import java.util.*;
import java.io.*;

public class prob04 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob04.txt"));
		System.out.println();
		boolean stop = false;
		while(!stop)
		{
			int one = input.nextInt();
			int two = input.nextInt();
			if(one == two && one == 0)
			{
				stop = true;
			}
			else
			{
				System.out.println(one * two);
			}
		}
	}
}
