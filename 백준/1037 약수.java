import java.util.*;
public class Solution {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)arr[i]=scan.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[n-1]);
	}
	
	
	
}
