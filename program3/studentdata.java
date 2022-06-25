package practice;
import java.util.Scanner;
class student{
	int usn;
	String name;
	String branch;
	int phno;
	public void setdata(int usn,String name,String branch,int phno)
	{
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phno=phno;
	}
	public void display()
	{
		System.out.println(""+name);
		System.out.println(""+usn);
		System.out.println(""+branch);
		System.out.println(""+phno);
	}
}
public class studentdata {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int usn;
     int phno;
     String name;
     String branch;
     int n,i;
     Scanner input=new Scanner(System.in);
     n=input.nextInt();
     student st[]=new student[n];
     for(i=0;i<n;++i) {
    	 st[i]=new student();
     }
     for(i=0;i<n;++i) {
    	 System.out.println("enter the usn,name,branch,phno");
    	 usn=input.nextInt();
    	 name=input.next();
    	 branch=input.next();
    	 phno=input.nextInt();
    	 System.out.println("the information hads been entered");
       st[i].setdata(usn, name, branch, phno);
     }
     input.close();
     System.out.println("the student details are");
     for(i=0;i<n;++i)
     {
    	 st[i].display();
     }
	}

}
