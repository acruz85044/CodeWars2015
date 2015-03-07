import java.text.DecimalFormat;
import java.util.*;
import java.io.*;

public class prob12 {
	static double[][] arr;
	static int max;
	static double maxSlope = -1231243;
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("prob12.txt"));
		System.out.println();
		int n = input.nextInt();
		max = n;
		arr = new double[max][max];
		input.nextLine();
		for(int w = 0; w < max; w++)
		{
			for(int x = 0; x < max; x++){
				arr[w][x] = input.nextDouble();
			}
		}
		for(int w = 0; w < max; w++){
			for(int x = 0; x < max; x++){
				double tempMax = getMax(w, x);
				maxSlope = maxSlope > tempMax?maxSlope:tempMax;	
			}
		}
		System.out.println("The max angle is " + new DecimalFormat("0.0000").format(Math.atan(maxSlope) * 180.0/Math.PI));
	}
	private static double getMax(int x, int y){
		double mSlope = -123;
		if(!outBounds(x, y - 1)){
			mSlope = Math.max(mSlope, (arr[x][y - 1] - arr[x][y]));
		}
		if(!outBounds(x, y + 1)){
			mSlope = Math.max(mSlope, (arr[x][y + 1] - arr[x][y]));
		}
		if(!outBounds(x + 1, y)){
			mSlope = Math.max(mSlope, (arr[x + 1][y] - arr[x][y]));
		}
		if(!outBounds(x - 1, y)){
			mSlope = Math.max(mSlope, (arr[x - 1][y] - arr[x][y]));
		}
		if(!outBounds(x - 1, y - 1)){
			mSlope = Math.max(mSlope, (arr[x-1][y - 1] - arr[x][y])/ Math.sqrt(2));
		}
		if(!outBounds(x + 1, y - 1)){
			mSlope = Math.max(mSlope, (arr[x+1][y - 1] - arr[x][y])/ Math.sqrt(2));
		}
		if(!outBounds(x - 1, y + 1)){
			mSlope = Math.max(mSlope, (arr[x-1][y + 1] - arr[x][y])/ Math.sqrt(2));
		}
		if(!outBounds(x + 1, y + 1)){
			mSlope = Math.max(mSlope, (arr[x+1][y + 1] - arr[x][y])/ Math.sqrt(2));
		}
		return mSlope;
	}
	private static boolean outBounds(int x, int y){
		return x < 0 || y < 0 || x >= max || y >= max;
	}
}
