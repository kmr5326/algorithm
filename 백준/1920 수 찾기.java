import java.util.*;
import java.io.*;
public class Main {
	
	static int m;
	static int n;
	static int[] A;
	static int[] X;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		A=new int[n];
		String[] s=br.readLine().split(" ");
		for(int i=0;i<n;i++)A[i]=Integer.parseInt(s[i]);
		m=Integer.parseInt(br.readLine());
		X=new int[m];
		s=br.readLine().split(" ");
		for(int i=0;i<m;i++)X[i]=Integer.parseInt(s[i]);
		br.close();
		Arrays.sort(A);
		for(int i=0;i<m;i++)
		{
			System.out.println(search(X[i],0,n-1));
		}
	}
	
	public static int search(int num,int start,int end)
	{
		int idx=(start+end)/2;
		if(start>end)return 0;
		if(num==A[idx])return 1;
		else if(num<A[idx])
		{
			return search(num,start,idx-1);
		}
		else
		{
			return search(num,idx+1,end);
		}
		
	}
	
}


