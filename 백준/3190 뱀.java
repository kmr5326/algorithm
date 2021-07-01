import java.util.*;
public class Main {
	static int[][] board;
	static int size;
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  size=scan.nextInt();
	  board=new int[size][size];
	  int apple=scan.nextInt();
	  for(int i=0;i<apple;i++)board[scan.nextInt()-1][scan.nextInt()-1]=-1;
	  int L=scan.nextInt();
	  scan.nextLine();
	  HashMap<Integer,String> hm=new HashMap<>();
	  for(int i=0;i<L;i++)
	  {
		  String[] str=scan.nextLine().split(" ");
		  hm.put(Integer.parseInt(str[0]), str[1]);
	  }
	  int time=0;
	  int tailtime=0;
	  int headr=0;
	  int headc=0;
	  int tailr=0;
	  int tailc=0;
	  board[headr][headc]=1;
	  int[] direction= {0,0,1,0}; //위 아래 오른쪽 왼쪽
	  int[] taildir= {0,0,1,0};
	  while(true)
	  {
		  /*System.out.println(time+": "+headr+" "+headc);
		  if(direction[0]==1)System.out.println("방향 위");
		  if(direction[1]==1)System.out.println("방향 아래");
		  if(direction[2]==1)System.out.println("방향 오른");
		  if(direction[3]==1)System.out.println("방향 왼");
		  System.out.println(tailtime+": "+tailr+" "+tailc);
		  if(taildir[0]==1)System.out.println("방향 위");
		  if(taildir[1]==1)System.out.println("방향 아래");
		  if(taildir[2]==1)System.out.println("방향 오른");
		  if(taildir[3]==1)System.out.println("방향 왼");
		  for(int i=0;i<size;i++)
		  {
			  for(int j=0;j<size;j++)System.out.print(board[i][j]);
			  System.out.println();
		  }*/
		  //시간증가
		  ++time;
		  ++tailtime;
		  //이동
		  if(direction[0]==1)
		  {
			  --headr;
			  if(headr==-1)break;
			  if(board[headr][headc]==1)break;
			  else if(board[headr][headc]==-1)
			  {
				  --tailtime;
				  board[headr][headc]=1;
			  }
			  else
			  {
				  board[headr][headc]=1;
				  board[tailr][tailc]=0;
				  if(taildir[0]==1)--tailr;
				  else if(taildir[1]==1)++tailr;
				  else if(taildir[2]==1)++tailc;
				  else if(taildir[3]==1)--tailc;
				  
				  
			  }
		  }
		  else if(direction[1]==1)
		  {
			  ++headr;
			  if(headr==size)break;
			  if(board[headr][headc]==1)break;
			  else if(board[headr][headc]==-1)
			  {
				  --tailtime;
				  board[headr][headc]=1;
			  }
			  else
			  {
				  board[headr][headc]=1;
				  board[tailr][tailc]=0;
				  if(taildir[0]==1)--tailr;
				  else if(taildir[1]==1)++tailr;
				  else if(taildir[2]==1)++tailc;
				  else if(taildir[3]==1)--tailc;
				  
				  
			  }
		  }
		  else if(direction[2]==1)
		  {
			  ++headc;
			  if(headc==size)break;
			  if(board[headr][headc]==1)break;
			  else if(board[headr][headc]==-1)
			  {
				  --tailtime;
				  board[headr][headc]=1;
			  }
			  else
			  {
				  board[headr][headc]=1;
				  board[tailr][tailc]=0;
				  if(taildir[0]==1)--tailr;
				  else if(taildir[1]==1)++tailr;
				  else if(taildir[2]==1)++tailc;
				  else if(taildir[3]==1)--tailc;
				  
				  
			  }
		  }
		  else
		  {
			  --headc;
			  if(headc==-1)break;
			  if(board[headr][headc]==1)break;
			  else if(board[headr][headc]==-1)
			  {
				  --tailtime;
				  board[headr][headc]=1;
			  }
			  else
			  {
				  board[headr][headc]=1;
				  board[tailr][tailc]=0;
				  if(taildir[0]==1)--tailr;
				  else if(taildir[1]==1)++tailr;
				  else if(taildir[2]==1)++tailc;
				  else if(taildir[3]==1)--tailc;
				  
				  
			  } 
		  }
		  //머리방향
		  if(hm.containsKey(time))
		  {
			  String s=hm.get(time);
			  if(s.equals("D"))
			  {
				  if(direction[0]==1)
				  {
					  direction[0]=0;
					  direction[2]=1;
				  }
				  else if(direction[1]==1)
				  {
					  direction[1]=0;
					  direction[3]=1;
				  }
				  else if(direction[2]==1)
				  {
					  direction[2]=0;
					  direction[1]=1;
				  }
				  else if(direction[3]==1)
				  {
					  direction[3]=0;
					  direction[0]=1;
				  }
			  }
			  else
			  {
				  if(direction[0]==1)
				  {
					  direction[0]=0;
					  direction[3]=1;
				  }
				  else if(direction[1]==1)
				  {
					  direction[1]=0;
					  direction[2]=1;
				  }
				  else if(direction[2]==1)
				  {
					  direction[2]=0;
					  direction[0]=1;
				  }
				  else if(direction[3]==1)
				  {
					  direction[3]=0;
					  direction[1]=1;
				  }
			  }
		  }
		  //꼬리방향
		  if(hm.containsKey(tailtime))
		  {
			  String s=hm.get(tailtime);
			  if(s.equals("D"))
			  {
				  if(taildir[0]==1)
				  {
					  taildir[0]=0;
					  taildir[2]=1;
				  }
				  else if(taildir[1]==1)
				  {
					  taildir[1]=0;
					  taildir[3]=1;
				  }
				  else if(taildir[2]==1)
				  {
					  taildir[2]=0;
					  taildir[1]=1;
				  }
				  else if(taildir[3]==1)
				  {
					  taildir[3]=0;
					  taildir[0]=1;
				  }
			  }
			  else
			  {
				  if(taildir[0]==1)
				  {
					  taildir[0]=0;
					  taildir[3]=1;
				  }
				  else if(taildir[1]==1)
				  {
					  taildir[1]=0;
					  taildir[2]=1;
				  }
				  else if(taildir[2]==1)
				  {
					  taildir[2]=0;
					  taildir[0]=1;
				  }
				  else if(taildir[3]==1)
				  {
					  taildir[3]=0;
					  taildir[1]=1;
				  }
			  }
			  hm.remove(tailtime);
		  }
	  }
	  System.out.println(time);
    }
  
  
  	
}
