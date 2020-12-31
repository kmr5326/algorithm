import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String dartResult) {
        int answer = 0,n=0;
        char[] ch=dartResult.toCharArray();
        Stack<Integer> stack=new Stack();
        for(int i=1;i<ch.length;i++)
        {
            if(Character.isDigit(ch[i]))continue;
            if(ch[i]=='S')
            {
                if(i!=1)
                {
                    if(Character.isDigit(ch[i-2]))stack.add((int)Math.pow(10,1));
                    else stack.add((int)Math.pow(ch[i-1]-'0',1));
                }
                else stack.add((int)Math.pow(ch[i-1]-'0',1));
            }
            else if(ch[i]=='D')
            {
                if(i!=1)
                {
                    if(Character.isDigit(ch[i-2]))stack.add((int)Math.pow(10,2));
                    else stack.add((int)Math.pow(ch[i-1]-'0',2));
                }
                else stack.add((int)Math.pow(ch[i-1]-'0',2));
            }
            else if(ch[i]=='T')
            {
                if(i!=1)
                {
                    if(Character.isDigit(ch[i-2]))stack.add((int)Math.pow(10,3));
                    else stack.add((int)Math.pow(ch[i-1]-'0',3));
                }
                else stack.add((int)Math.pow(ch[i-1]-'0',3));
            }
            if(ch[i]=='*')
            {
                if(stack.size()==1)stack.add(stack.pop()*2);
                else
                {
                    n=stack.pop()*2;
                    stack.add(stack.pop()*2);
                    stack.add(n);
                }
            }
            else if(ch[i]=='#')stack.add(stack.pop()*-1);
        }
        while(!stack.isEmpty())answer+=stack.pop();
        return answer;
    }
}
