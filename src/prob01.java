import java.util.*;
import java.io.*;

public class prob01 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob01.txt"));
		while(input.hasNext())
		{
			System.out.println("We couldn't have this competition without you, " + input.next() + "! Thank you for your love and compassion!");
			System.out.println("\n\nPlease have mercy on our scores.");
		}
	}
}
