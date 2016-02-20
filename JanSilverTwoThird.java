import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JanSilverTwoThird {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("div7.in"));
		PrintWriter pw = new PrintWriter(new File("div7.out"));
		int max = 0;
		int sum = 0;
		//int counter = 0;
		int numCows = in.nextInt();
		double[] sums = new double[numCows];
		for(int i = 0; i < numCows; i++)
		{
			sum += in.nextInt();
			sums[i] = sum;
		}
		
		for(int i = 0; i < numCows; i++)
		{
			if(numCows-i+1<max)
				break;
			
			for(int j = i; j < numCows; j++)
			{
				if(i == 0)
				{
					if(sums[j] %7 == 0)
						max = j;
				}
				else 
				{
					if(sums[j]-sums[i-1] % 7 == 0)
						if((j-i) > max)
							max = j-i;
				}
			}
			
		}
		
		System.out.println(max);
		pw.close();
		
		
	}
}