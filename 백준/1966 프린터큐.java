import java.util.*;
import java.io.*;
public class Main {
	
	static int t;
	static int n;
	static int m;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			n=scan.nextInt();
			m=scan.nextInt();
			Queue<Integer> q=new LinkedList<>();
			int[] priority=new int[n];
			for(int j=0;j<n;j++) 
			{
				priority[j]=scan.nextInt();
				q.offer(priority[j]);
			}
			Arrays.sort(priority);
			int idx=n-1;
			int cnt=0;
			while(!q.isEmpty())
			{
				if(q.peek()==priority[idx])
				{
					idx--;
					q.poll();
					cnt++;
					if(m==0)break;
					m--;
				}
				else
				{
					q.offer(q.poll());
					m--;
					if(m==-1)m=q.size()-1;
				}
			}
			System.out.println(cnt);
		}
		scan.close();
		
	}
	
}


