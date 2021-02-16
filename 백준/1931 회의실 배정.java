import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] s=new String[n];
		for(int i=0;i<n;i++)s[i]=br.readLine();
		br.close();
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++)
		{
			String[] str=s[i].split(" ");
			arr[i][0]=Integer.parseInt(str[0]);
			arr[i][1]=Integer.parseInt(str[1]);
		}
		Arrays.sort(arr,new Comparator<int[]> () {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[1] == o2[1])
					return o1[0]-o2[0];
				else 
					return o1[1]-o2[1];
			}
		});
		/*for(int i=0;i<n;i++)
		{
			System.out.print(arr[i][0]+" ");
			System.out.println(arr[i][1]);
		}*/
		int cnt=0,endtime=0;
		for(int i=0;i<n;i++)
		{
			if(endtime<=arr[i][0])
			{
				endtime=arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
}


