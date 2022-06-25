package p1;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int fact,i,n;
	//	int n=5;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		fact=1;
		for(i=1;i<=n;++i) {
			fact=fact*i;
		}
		System.out.println("the factorial of n is "+fact);
	}

}
