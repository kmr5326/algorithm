import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] left=new int[]{0,3};
        int[] right=new int[]{2,3};
        int[] center=new int[]{1,0};
        int ld,rd;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]%3==1)
            {
                left[0]=0;
                left[1]=numbers[i]/3;
                answer+="L";
            }
            else if(numbers[i]%3==0)
            {
                if(numbers[i]!=0)
                {
                    right[0]=2;
                    right[1]=numbers[i]/3-1;
                    answer+="R";
                }
                else //0
                {
                    center[1]=3;
                    ld=Math.abs(left[0]-center[0])+Math.abs(left[1]-center[1]);
                    rd=Math.abs(right[0]-center[0])+Math.abs(right[1]-center[1]);
                    if(ld==rd)
                    {
                        if(hand.equals("left"))
                        {
                            answer+="L";
                            left[0]=center[0];
                            left[1]=center[1];
                        }
                        else
                        {
                            answer+="R";
                            right[0]=center[0];
                            right[1]=center[1];
                        }
                    }
                    else if(ld<rd)
                    {
                        answer+="L";
                        left[0]=center[0];
                        left[1]=center[1];
                    }
                    else
                    {
                        answer+="R";
                        right[0]=center[0];
                        right[1]=center[1];
                    }
                }
            }
            else //Áß¾Ó
            {
                center[1]=numbers[i]/3;
                ld=Math.abs(left[0]-center[0])+Math.abs(left[1]-center[1]);
                rd=Math.abs(right[0]-center[0])+Math.abs(right[1]-center[1]);
                if(ld==rd)
                {
                    if(hand.equals("left"))
                    {
                        answer+="L";
                        left[0]=center[0];
                        left[1]=center[1];
                    }
                    else
                    {
                        answer+="R";
                        right[0]=center[0];
                        right[1]=center[1];
                    }
                }
                else if(ld<rd)
                {
                    answer+="L";
                    left[0]=center[0];
                    left[1]=center[1];
                }
                else
                {
                    answer+="R";
                    right[0]=center[0];
                    right[1]=center[1];
                }
            }
        }
        return answer;
    }
}
