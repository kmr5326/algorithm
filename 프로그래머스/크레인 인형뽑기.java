
import java.util.*;


public class Solution
{
	public static void main(String args[]) throws Exception
	{
		
	}
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] doll=new int[moves.length];
        int idx=1;
        for(int i=0;i<moves.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[j][moves[i]-1]!=0)
                {
                    if(doll[idx-1]==board[j][moves[i]-1])
                    {
                        answer+=2;
                        board[j][moves[i]-1]=0;
                        doll[--idx]=0;
                        break;
                    }
                    else 
                    {
                        doll[idx++]=board[j][moves[i]-1];
                        board[j][moves[i]-1]=0;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<=idx;i++)System.out.print(doll[i]+" ");
        return answer;
    }
}