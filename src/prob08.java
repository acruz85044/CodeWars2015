import java.util.*;
import java.io.*;

public class prob08 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob08.txt"));
		System.out.println();
		int n = input.nextInt();
		input.nextLine();
		String people[] = new String[301];
		int empty = 0;
		int duplicate = 0;
		int lack = 0;
		boolean dupl[] = new boolean[301];
		for(int i = 0; i < n; i++)
		{
			String line[] = input.nextLine().split(" ");
			int given = Integer.parseInt(line[1]);
			
			if(given == 0)
			{
				lack++;
			}
			else if(line[0].equals("NA"))
			{
				empty++;
			}
			else if(!(people[given] == null) && !dupl[given])
			{
				duplicate++;
				dupl[given] = true;
			}
			else
			{
				people[given] = line[0];
			}
		}
		System.out.println("Empty Cubes: " + empty);
		System.out.println("Duplicate Cube Assignments: " + duplicate);
		System.out.println("Employees without Cube: " + lack);
	}
}
