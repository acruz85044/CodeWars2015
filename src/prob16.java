import java.util.*;
import java.io.*;

public class prob16 {
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob16-1-in.txt"));
		System.out.println();
		int n = input.nextInt();
		input.nextLine();
		Trans[] arr = new Trans[n];
		ArrayList<MappyNode> stuff = new ArrayList<MappyNode>();
		
		String line[] = input.nextLine().split(" ");
		MappyNode root = new MappyNode (line[0]);
		MappyNode theNext = new MappyNode(line[2]);
		Trans t = new Trans(line[1], root, theNext);
		root.next.add(t);
		arr[0] = new Trans(line[1], root, theNext);
		stuff.add(root);
		stuff.add(theNext);
		for(int i = 1; i < n; i++)
		{
			line = input.nextLine().split(" ");
			MappyNode node = new MappyNode(line[0]);
			theNext = new MappyNode(line[2]);
			boolean hasDuplicate = false;
			for(int q = 0; q < stuff.size() && !hasDuplicate; q++)
			{
				if(line[2].equals(stuff.get(q)))
				{
					hasDuplicate = true;
					theNext = stuff.get(q);
				}
			}
			
			t = new Trans(line[1], node, theNext);
			node.next.add(t);
			arr[i] = t;
		}
		
		String[] code = input.nextLine().split("");
		
		MappyNode next = root;
		
		for(int j = 0; j < code.length; j++)
		{
			String v = "";
			boolean found = false;
			ArrayList<Trans> nextList = next.next;
			Trans tranny = null;
			int p = 0;
			while(!found)
			{
				if(nextList.get(p).value.equals(code[j]))
				{
					found = true;
					tranny = nextList.get(p);
				}
				p++;
			}

			next = tranny.next;
			System.out.print(next.value);
		}
	}
}

class MappyNode{
	ArrayList<Trans> next;
	String value;
	
	public MappyNode(String val)
	{
		value = val;
		next = new ArrayList<Trans>();
	}
}

class Trans{
	MappyNode prev;
	MappyNode next;
	String value;
	
	public Trans(String val, MappyNode p, MappyNode n)
	{
		value = val;
		prev = p;
		next = n;
	}
}