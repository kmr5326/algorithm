import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		AgeSort[] arr=new AgeSort[N];
		for(int i=0;i<N;i++) 
		{
			arr[i]= new AgeSort(scan.nextInt(),scan.next());
		}
		Arrays.sort(arr);
		for(int i=0;i<N;i++)
		{
			System.out.println(arr[i].age+" "+arr[i].name);
		}
	}
	
	
	
}

class AgeSort implements Comparable<AgeSort>
{
	public int age;
	public String name;
	
	public AgeSort(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public int compareTo(AgeSort other)
	{
		return Integer.compare(this.age, other.age);
	}

}


