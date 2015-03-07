import java.util.*;
import java.io.*;

public class prob10 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob10.txt"));
		System.out.println();
		int n = input.nextInt();
		input.nextLine();
		HashMap map = new HashMap<String, Character>();
		map.put("81", 'a');
		map.put("82", 'b');
		map.put("83", 'c');
		map.put("84", 'd');
		map.put("85", 'e');
		map.put("86", 'f');
		map.put("87", 'g');
		map.put("88", 'h');
		map.put("89", 'i');
		map.put("91", 'j');
		map.put("92", 'k');
		map.put("93", 'l');
		map.put("94", 'm');
		map.put("95", 'n');
		map.put("96", 'o');
		map.put("97", 'p');
		map.put("98", 'q');
		map.put("99", 'r');
		map.put("A2", 's');
		map.put("A3", 't');
		map.put("A4", 'u');
		map.put("A5", 'v');
		map.put("A6", 'w');
		map.put("A7", 'x');
		map.put("A8", 'y');
		map.put("A9", 'z');
		map.put("C1", 'A');
		map.put("C2", 'B');
		map.put("C3", 'C');
		map.put("C4", 'D');
		map.put("C5", 'E');
		map.put("C6", 'F');
		map.put("C7", 'G');
		map.put("C8", 'H');
		map.put("C9", 'I');
		map.put("D1", 'J');
		map.put("D2", 'K');
		map.put("D3", 'L');
		map.put("D4", 'M');
		map.put("D5", 'N');
		map.put("D6", 'O');
		map.put("D7", 'P');
		map.put("D8", 'Q');
		map.put("D9", 'R');
		map.put("E2", 'S');
		map.put("E3", 'T');
		map.put("E4", 'U');
		map.put("E5", 'V');
		map.put("E6", 'W');
		map.put("E7", 'X');
		map.put("E8", 'Y');
		map.put("E9", 'Z');
		map.put("40", ' ');
		map.put("4B", '.');
		map.put("6B", ',');
		map.put("5A", '!');
		for(int i = 0; i < n; i++)
		{
			int f = input.nextInt();
			for(int g = 0; g < f; g++){
				System.out.print(map.get(input.next()));
			}
			System.out.println();
		}
	}
}
