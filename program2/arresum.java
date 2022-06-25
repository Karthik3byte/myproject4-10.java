package p1; 
import java.util.Scanner;

public class arresum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n,sum=0;
	    System.out.println("enter the size of array");
		n=input.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		//input.close();
		for(int i=0;i<n;i++) {
			sum=a[i]+sum;
		}
		System.out.println("the sum of array is  "+sum);
			
	}

}
