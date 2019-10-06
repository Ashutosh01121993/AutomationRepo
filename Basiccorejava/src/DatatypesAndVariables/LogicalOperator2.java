package DatatypesAndVariables;

import java.util.Scanner;

public class LogicalOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int IIT=10;

Scanner sc=new Scanner(System.in);
System.out.println("Enter your CET score");

int cet=sc.nextInt();
if(cet>=80 || IIT>=40)
{
	System.out.println("You are eligible");
}else {
	System.out.println("You are not eligible");
}
	}

}
