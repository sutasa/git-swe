package odd_event;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num < 0) {
			System.out.println("Less than");
		}
		else if(num > 100) {
			System.out.println("more than");
		}
		else {
			System.out.println("Ok");
		}
	}
}
