import java.util.*;
public class Main {
  public static void main(String[] args) {
    
    }
}
  
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> minq=new PriorityQueue<>();
        PriorityQueue<Integer> maxq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<operations.length;i++)
        {
            String[] split=operations[i].split(" ");
            if(split[0].equals("I"))
            {
                minq.offer(Integer.parseInt(split[1]));
                maxq.offer(Integer.parseInt(split[1]));
            }
            else
            {
                int tmp=Integer.parseInt(split[1]);
                if(tmp==1)
                {
                    if(!maxq.isEmpty())minq.remove(maxq.poll());
                }
                else if(!minq.isEmpty())minq.poll();
            }
        }
        if(minq.size()==1)
        {
            answer[0]=minq.poll();
            answer[1]=answer[0];
        }
        else if(minq.size()>1)
        {
            answer[1]=minq.poll();
            while(minq.size()>1)
            {
                minq.poll();
            }
            answer[0]=minq.poll();
        }
        return answer;
    }
}