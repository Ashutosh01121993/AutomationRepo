package Array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str=new String[12];
		
		str[0]="Pramila";
		str[1]="Lohiya Sahab";
		str[2]="Tripathi Sahab";
		str[3]="Pratik Bevada";
		str[4]="Pratik Tharaki";
		str[5]="Nikhil";
		str[6]="Shristi";
		str[7]="Aniket";
		str[8]="Ganesh";
		str[9]="Jyoti";
		str[10]="Ayesha";
		str[11]="Seema";
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
	}
		
		System.out.println(str.length);

		/*
		 * for(String s:str)s is local variable to initialization in for loop, this is
		 * each for loop or enhance for loop
		 */
	 /*{
	System.out.println(s);
}
*/}}
