import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> que=new LinkedList<Integer>();
        for(int i:priorities)que.add(i);
        Arrays.sort(priorities);
        int idx=priorities.length-1;
        int put;
        while(!que.isEmpty())
        {
            if(que.peek()==priorities[idx])
            {
                que.poll();
                answer++;
                if(location==0)break;
                location--;
                idx--;
            }
            else
            {
                put=que.poll();
                que.add(put);
                if(location==0)location=que.size()-1;
                else location--;
            }
        }
        return answer;
    }
}
