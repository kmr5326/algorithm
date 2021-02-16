import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=scan.nextInt();
		int[] time=new int[n];
		for(int i=0;i<n;i++)
		{
			time[i]=scan.nextInt();
		}
		Arrays.sort(time);
		for(int i=1;i<n;i++)time[i]+=time[i-1];
		int sum=0;
		for(int i=0;i<n;i++)sum+=time[i];
		System.out.println(sum);
	}
	
}


