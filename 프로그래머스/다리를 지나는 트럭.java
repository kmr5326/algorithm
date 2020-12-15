
import java.util.*;


public class Solution
{
	public static void main(String args[]) throws Exception
	{
		
	}
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0,idx=0,tw=0,startidx=0,endidx=0;
        Stack<Integer> stack=new Stack<>();
        int[] time=new int[truck_weights.length];
        for(int i=truck_weights.length-1;i>-1;i--)stack.add(truck_weights[i]);
        while(!stack.isEmpty())
        {
            
            if(time[idx]!=0&&time[idx]%bridge_length==0)
            {
               tw-=truck_weights[idx++];
                startidx++;
            }
            if(tw+stack.peek()<=weight)
            {
                tw+=stack.pop();
                endidx++;
            }
            for(int i=startidx;i<endidx;i++)time[i]++;
            answer++;
        }
        answer+=bridge_length;
        return answer;
    }
}