import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int n) {
        int size=0;
        for(int i=1;i<=n;i++)size+=i;
        int[] answer = new int[size];
        int move=0;
        int num=1;
        int idx=0;
        while(true)
        {
            for(int i=0;i<n;i++)
            {
                idx+=move;
                move++;
                answer[idx]=num;
                num++;
            }
            n--;
            if(n==0)break;
            for(int i=0;i<n;i++)
            {
                idx++;
                answer[idx]=num;
                num++;
            }
            n--;
            if(n==0)break;
            for(int i=0;i<n;i++)
            {
                idx-=move;
                move--;
                answer[idx]=num;
                num++;
            }
            n--;
            if(n==0)break;            
        }
        
        return answer;
    }
}
