import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] progresses, int[] speeds) {
        int[] time=new int[speeds.length];
        Stack<Integer> stack=new Stack<Integer>();
        int n;
        int[] cnt=new int[time.length];
        int idx=-1;
        for(int i=0;i<progresses.length;i++)
        {
            while(progresses[i]<100)
            {
                progresses[i]+=speeds[i];
                time[i]++;
            }
        }
        for(int i=time.length-1;i>-1;i--)stack.push(time[i]);
        while(!stack.isEmpty())
        {
            n=stack.pop();
            idx++;
            cnt[idx]++;
            if(stack.isEmpty())break;
            else
            {
                while(!stack.isEmpty())
                {
                    if(stack.peek()<=n)
                    {
                        stack.pop();
                        cnt[idx]++;
                    }
                    else break;
                }
            }
        }
        int[] answer = new int[idx+1];
        for(int i=0;i<idx+1;i++)answer[i]=cnt[i];
        return answer;
    }
}
