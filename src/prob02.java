import java.util.*;
import java.io.*;

public class prob02 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob02.txt"));
		long compliment = input.nextLong();
		long search = input.nextLong();
		System.out.println(compliment * search);
	}
}
