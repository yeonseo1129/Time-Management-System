package timetime;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeManager {
	ArrayList<Time> times = new ArrayList<Time>() ;
	Scanner input;
	TimeManager(Scanner input){
		this.input=input;
	}

	public void addtodolist() {
		Time time = new Time();
		
		System.out.print("priority:");
		time.priority = input.nextInt();
		input.nextLine();
		
		System.out.print("todo:");
		time.todo = input.nextLine();
		
		System.out.print("deadline:");
		time.deadline = input.nextLine();
		
		System.out.print("memo:");
		time.memo = input.nextLine();
		times.add(time);
	}
	
	public void deletetodolist() {
		System.out.print("priority:");
		int priority = input.nextInt();
		int index = -1 ;
		for (int i=0; i<times.size(); i++) {
			if (times.get(i).priority == priority) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			times.remove(index);
			System.out.println("The todolist" + index + "is deleted!");
		}
		else {
			System.out.println("The todolist has not been registered!");
			return;
		}
	}
			
	public void edittodolist() {
		System.out.print("priority:");
		int priority = input.nextInt();
		for (int i=0; i<times.size(); i++) {
			Time time =times.get(i);
			if (time.priority == priority);{
				int num = -1;
				while (num != 5) {
					System.out.println("*** Time Info Edit Menu***");
					System.out.println("1.Edit priority");
					System.out.println("2.Edit todo");
					System.out.println("3.Edit deadline");
					System.out.println("4.View memo");
					System.out.println("5.Exit");
					System.out.println("Select one number between 1 - 6:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Priority");
						time.priority=input.nextInt();
					}
					else if (num == 2) {
						System.out.print("Todo");
						time.todo=input.next();
				}
					else if (num == 3) {
						System.out.print("Deadline");
						time.deadline=input.next();
				}
					else if (num == 4) {
						System.out.print("Memo");
						time.memo=input.next();
					}
					else {
						continue;
					}
				}
				break;
		    }  
	    }
	}
	
	public void viewtodolists() {
//		System.out.print("priority:");
//		int priority = input.nextInt();
		for (int i=0; i<times.size(); i++) {
			times.get(i).printInfo();
	      }
	    }
	 }
	

	