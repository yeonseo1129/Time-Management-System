package pr;

import java.util.Scanner;

public class K {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6){
			System.out.println("1.Add todolist");
			System.out.println("2.Delete todolist");
			System.out.println("3.Edit todolist");
			System.out.println("4.View todolist");
			System.out.println("5.Show a menu");
			System.out.println("6.Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Priority:");
				int priority= input.nextInt();
				System.out.print("Todo:");
				String todo = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Priority:");
				int priority1= input.nextInt();
				
			}
		}
	}
}
			
