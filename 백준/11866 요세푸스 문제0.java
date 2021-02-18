import java.util.*;
import java.io.*;
public class Main {
	
	static int k;
	static int n;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=scan.nextInt();
		k=scan.nextInt();
		scan.close();
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<=n;i++)q.offer(i);
		int cnt=1;
		System.out.print("<");
		while(!q.isEmpty())
		{
			if(cnt==k)
			{
				if(q.size()==1)System.out.print(q.poll());
				else System.out.print(q.poll()+", ");
				cnt=1;
			}
			else
			{
				q.offer(q.poll());
				cnt++;
			}
		}
		System.out.print(">");
	}
	
}


