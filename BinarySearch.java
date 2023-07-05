
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("for binary search array should be sorted");
		System.out.println("Enter the size of the array");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the elements in th array");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int x= sc.nextInt();
		int lb=0;
		int ub=n-1;
		int mid=(lb+ub)/2;
		while(lb<ub)
			{
				if(arr[mid]==x)
				{
					System.out.println("The element is foud at the index  "+mid);
					break;
				}
				else if(arr[mid]<x)
				{
					lb=mid+1;
				}
				else if(arr[mid]>x)
				{
					ub=mid-1;
				}
				mid=(lb+ub)/2;
			}
		

	}

}
