import java.util.*;
import java.io.*;
public class Main {
	
	static PriorityQueue<Integer> q;
	static int n;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		q=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			int a=Integer.parseInt(br.readLine());
			if(a!=0)q.offer(a);
			else
			{
				if(!q.isEmpty())System.out.println(q.poll());
				else System.out.println(0);
			}
		}
		br.close();
	}
	
	
}


