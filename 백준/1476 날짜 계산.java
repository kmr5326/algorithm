//import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		int e=Integer.parseInt(str[0]);
		int s=Integer.parseInt(str[1]);
		int m=Integer.parseInt(str[2]);
		int a=0,b=0,c=0;
		br.close();
		for(int i=0;;i++)
		{
			if(a==e&&b==s&&c==m)
			{
				System.out.println(i);
				break;
			}
			a++;
			b++;
			c++;
			if(a==16)a=1;
			if(b==29)b=1;
			if(c==20)c=1;
		}
		
		
	}
	
	
	
}


