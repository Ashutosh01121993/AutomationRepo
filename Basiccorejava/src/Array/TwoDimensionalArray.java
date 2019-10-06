package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data[][]=new String[5][2];

data[0][0]="Ashu";
data[0][1]="Ashu@1234";


data[1][0]="Pratik";
data[1][1]="Password1";


data[2][0]="Anand";
data[2][1]="Password1";


data[3][0]="Atul";
data[3][1]="Password1";


data[4][0]="Chinmay";
data[4][1]="Password1";

//to find out Multi dimension array hence we have used r<data.length and called c<data[r].length so it will find column at particular row//

for(int r=0;  r<data.length; r++)
{
	for(int c=0;  c<data[r].length; c++)
	{
		System.out.print("  "  +data[r][c]);
	}
	System.out.println();



	}

}}
