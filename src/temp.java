
public class temp {
	public static void main(String[] args){
		int i = 1;
		System.out.println("ArrayList<Integer> flip = new ArrayList<>();");
		while(i <= 1e6){
			System.out.println("flip.add(" + i + ");");
			i = i%2==0?i*2 + 1 : i * 2;
		}
	}
}
