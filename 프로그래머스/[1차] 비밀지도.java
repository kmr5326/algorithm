import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] code=new String[n];
        for(int i=0;i<n;i++)
        {
            code[i]=Integer.toString(arr1[i],2);
            if(code[i].length()<n)
            {
                while(code[i].length()!=n)
                {
                    code[i]="0"+code[i];
                }
            }
        }
        String[] code1=new String[n];
        for(int i=0;i<n;i++)
        {
            code1[i]=Integer.toString(arr2[i],2);
            if(code1[i].length()<n)
            {
                while(code1[i].length()!=n)
                {
                    code1[i]="0"+code1[i];
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(code[i].charAt(j)=='1'||code1[i].charAt(j)=='1')
                {
                    sb.append("#");
                }
                else
                {
                    sb.append(" ");
                }
            }
            answer[i]=sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}
