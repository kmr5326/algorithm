import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		//String s=s.nextLine();
		Stack<Integer> stack=new Stack<>();
		for(int i=1;i<=n;i++)
		{
			String s=br.readLine();
			if(s.contains("push"))
			{
				String str[]=s.split(" ");
				stack.push(Integer.parseInt(str[1]));
			}
			else if(s.equals("pop"))
			{
				if(stack.empty())System.out.println(-1);
				else System.out.println(stack.pop());
			}
			else if(s.equals("size"))
			{
				System.out.println(stack.size());
			}
			else if(s.equals("empty"))
			{
				if(stack.empty())System.out.println(1);
				else System.out.println(0);
			}
			else if(s.equals("top"))
			{
				if(stack.empty())System.out.println(-1);
				else System.out.println(stack.peek());
			}
		}
		br.close();
	}
	
}
