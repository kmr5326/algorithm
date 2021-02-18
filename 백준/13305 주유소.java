import java.util.*;
import java.io.*;
public class Main {
	
	static long[] distance;
	static long[] cost;
	static int n;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=scan.nextInt();
		distance=new long[n-1];
		cost=new long[n];
		for(int i=0;i<n-1;i++)distance[i]=scan.nextInt();
		for(int i=0;i<n;i++)cost[i]=scan.nextInt();
		scan.close();
		long total=0;
		long min=cost[0];
		for(int i=0;i<n-1;i++)
		{
			if(min<cost[i])
			{
				total+=min*distance[i];
			}
			else
			{
				min=cost[i];
				total+=min*distance[i];
			}
		}
		System.out.println(total);
	}
	
	
	
}


