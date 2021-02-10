//import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			cnt=0;
			String s=br.readLine();
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='(')cnt++;
				else if(s.charAt(j)==')')cnt--;
				if(cnt<0)
				{
					//System.out.println("NO");
					break;
				}
			}
			if(cnt==0)System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
}
