import java.util.*;
import java.io.*;

public class prob03 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob03.txt"));
		System.out.println();
		int val = input.nextInt();
		String str = "";
		switch(val)
		{
			case 1: str = "one"; break;
			case 2: str = "two"; break;
			case 3: str = "three"; break;
			case 4: str = "four"; break;
			case 5: str = "five"; break;
			case 6: str = "six"; break;
			case 7: str = "seven"; break;
			case 8: str = "eight"; break;
			case 9: str = "nine"; break;
			default: str = "ten";
		}
		System.out.println("Number " + str + " is alive!");
	}
}
