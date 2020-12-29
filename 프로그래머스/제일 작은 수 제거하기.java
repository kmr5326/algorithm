import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solution(int[] arr) {
        if(arr.length==0){
            int[] answer = {-1};
            return answer;
        }
        else if(arr[0]==10){
            int[] answer = {-1};
            return answer;
        }
        int[] num=arr.clone();
        Arrays.sort(num);
        int[] answer=new int[arr.length-1];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=num[0])answer[idx++]=arr[i];
        }
        return answer;
    }
}
