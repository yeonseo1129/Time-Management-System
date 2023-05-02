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
		int kind = 0;
		Time priority;
		while (kind != 1 && kind !=2) {
		System.out.print("1 for Night:");
		System.out.print("2 for Dinner:");
		System.out.print("Select num for Todo Kind between 1 and 2:");
		kind = input.nextInt();
		if (kind == 1) {
			priority = new Time();
			priority.getUserInput(input);
			times.add(priority);
			break;
			
		}
		else if (kind ==2) {
			priority = new Dinnertime();
			priority.getUserInput(input);
			times.add(priority);
			break;

		}
		else {
			System.out.print("Select num for Todo Kind between 1 and 2:");
		}
		}
	
	
	}
	
	public void deletetodolist() {
		System.out.print("priority:");
		int priority = input.nextInt();
		int index = -1 ;
		for (int i=0; i<times.size(); i++) {
			if (times.get(i).getPriority() == priority) {
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
			if (time.getPriority() == priority);{
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
						int priority = input.nextInt();
						time.setPriority(priority);
					}
					else if (num == 2) {
						System.out.print("Todo");
						String todo=input.next();
						time.setTodo(todo);
				}
					else if (num == 3) {
						System.out.print("Deadline");
						String deadline=input.next();
						time.setDeadline(deadline);
				}
					else if (num == 4) {
						System.out.print("Memo");
						String memo=input.next();
						time.setMemo(memo);
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
	

	