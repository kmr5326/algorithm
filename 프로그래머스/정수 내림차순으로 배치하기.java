import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public long solution(long n) {
        long answer = 0;
        int exp=0;
        long num=n;
        while(num>0)
        {
            num/=10;
            exp++;
        }
        long[] arr=new long[exp];
        exp--;
        int idx=0;
        while(n>0)
        {
            arr[idx++]=n%10;
            n/=10;
        }
        long tmp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            answer+=Math.pow(10,exp--)*arr[i];
        }
        return answer;
    }
}
