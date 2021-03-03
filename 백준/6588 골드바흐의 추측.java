import java.util.*;
import java.io.*;
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean[] pn=new boolean[1000001];
		Arrays.fill(pn, false);
		for(int i=2;i<1000001;i++)
		{
			if(!pn[i])
			{
				for(int j=i+i;j<1000001;j+=i)pn[j]=true;
			}
		}
		while(true)
		{
			int n=Integer.parseInt(br.readLine());
			if(n==0)break;
			
			boolean tf=false;
			for(int i=2;i<n;i++)
			{
				if(!pn[i]&&!pn[n-i])
				{
					tf=true;
					System.out.println(n+" = "+i+" + "+(n-i));
					break;
				}
			}
			if(!tf)System.out.println("Goldbach's conjecture is wrong.");
		}
		
	}
	
	
	
}


