import java.util.*;
import java.io.*;

public class prob13 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob13-1-in.txt"));
		System.out.println();
		String s = input.nextLine(); 
		int n = input.nextInt();
		input.nextLine();
		ArrayList<Integer> flip = new ArrayList<Integer>();
		flip.add(1);
		flip.add(2);
		flip.add(5);
		flip.add(10);
		flip.add(21);
		flip.add(42);
		flip.add(85);
		flip.add(170);
		flip.add(341);
		flip.add(682);
		flip.add(1365);
		flip.add(2730);
		flip.add(5461);
		flip.add(10922);
		flip.add(21845);
		flip.add(43690);
		flip.add(87381);
		flip.add(174762);
		flip.add(349525);
		flip.add(699050);
		
//		int c = input.nextInt();
		int start = 0;
		for(int w = 1; w < s.length() - 1; w++){
			if((flip.contains(Integer.parseInt(s.substring(start, w + 1))))){
				
			}
			else{
				start = w;
				System.out.println(s.substring(start, w));
			}
		}
	}
}
