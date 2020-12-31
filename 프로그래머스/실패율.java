import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[] fail=new float[N+1];
        float[] cnt=new float[N+1];
        for(int i=0;i<stages.length;i++)
        {
            if(stages[i]!=N+1)
            {
                fail[stages[i]]++;
                cnt[stages[i]]++;
            }
        }
        for(int i=1;i<fail.length;i++)
        {
            float player=0;
            for(int j=1;j<=i;j++)player+=cnt[j-1];
            fail[i]/=stages.length-player;
        }
        for(int i=0;i<N;i++)answer[i]=i+1;
        for(int i=1;i<fail.length;i++)
        {
            for(int j=1;j<fail.length-1;j++)
            {
                if(fail[j]<fail[j+1])
                {
                    float a=fail[j];
                    fail[j]=fail[j+1];
                    fail[j+1]=a;
                    int tmp=answer[j-1];
                    answer[j-1]=answer[j];
                    answer[j]=tmp;
                }
            }
        }
        return answer;
    }
}
