import java.util.*;
import java.io.*;

public class prob09 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob09.txt"));
		System.out.println();
		boolean stop = false;
		ArrayList<Integer> team = new ArrayList<Integer>();
		ArrayList<Integer> score = new ArrayList<Integer>();
		while(!stop)
		{
			int tm = input.nextInt();
			int sc = input.nextInt();
			if(tm == sc && tm == 0)
			{
				stop = true;
			}
			else
			{
				if(team.contains(tm))
				{
					score.set(team.indexOf(tm), score.get(team.indexOf(tm)) + sc);
				}
				else{
					team.add(tm);
					score.add(sc);
				}
			}
		}
		
		for(int i = 1; i < 6; i++)
		{
			int indexMax = 0;
			for(int w = 0; w < score.size(); w++)
			{
				if(score.get(indexMax) < score.get(w))
				{
					indexMax = w;
				}
			}
			System.out.println(i + " " + team.remove(indexMax) + " " + score.remove(indexMax));
		}
	}
}
