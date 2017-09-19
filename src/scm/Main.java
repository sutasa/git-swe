package scm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("ID : ");
		String id = in.nextLine();
		System.out.print("Name : ");
		String name = in.nextLine();
		
		System.out.print("salary : ");
		double salary = in.nextDouble();
		
		System.out.print("comission : ");
		double com = in.nextDouble();
		A re = new A(salary,com);
		
		
		System.out.println(name+" Income : "+" "+re.find());
	}

}
