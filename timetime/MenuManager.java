package timetime;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TimeManager timeManager = new TimeManager(input);
		
		int num = 0;
		while(num !=5){
			System.out.println("*** Time Management System Menu***");
			System.out.println("1.Add todolist");
			System.out.println("2.Delete todolist");
			System.out.println("3.Edit todolist");
			System.out.println("4.View todolists");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1 - 6:");
			
			num = input.nextInt();
			if (num==1) {
				timeManager.addtodolist();
				
			}
			else if (num==2) {
				timeManager.deletetodolist();
				
			}
			else if (num==3) {
				timeManager.edittodolist();
				
			}
			else if (num==4) {
				timeManager.viewtodolists();
				
			}
			else {
				continue;
			}
			
		}
	}
}