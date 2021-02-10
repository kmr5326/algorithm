import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Stack<Integer> stack=new Stack<>();
		for(int i=1;i<=n;i++)
		{
			int k=Integer.parseInt(br.readLine());
			if(k==0)
			{
				if(!stack.empty())
				{
					stack.pop();
				}
			}
			else
			{
				stack.push(k);
			}
		}
		br.close();
		int sum=0;
		while(!stack.empty())
		{
			sum+=stack.pop();
		}
		System.out.println(sum);
	}
	
}
