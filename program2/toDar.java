package p1;
import java.util.Scanner;
public class toDar { 
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("enter the size of rows and column");
		m=input.nextInt();
		n=input.nextInt();
		int a[][]=new int[m][n];
		for(i=0;i<m;++i) {
			for(j=0;j<n;++j) {
				a[i][j]=input.nextInt();
			}
		}
		System.out.println("the 2d array \n");
		for(i=0;i<m;++i) {
			for(j=0;j<n;++j) {
				System.out.println("   "+a[i][j]);
			}
			System.out.println(" \n");
		}

		
	}

}
