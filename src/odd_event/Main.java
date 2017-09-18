package odd_event;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String G;
		if(num>=80) {
			G="A";
		}else if(num>=70) {
			G="B";
		}else if(num>=60)
		{
			G="C";
		}else if(num>=50)
		{
			G="D";
		}else
			G="F";
		System.out.println("Grade :"+G);
	}
}
