package timetime;

import java.util.ArrayList;
import java.util.Scanner;

public class TimeManager {
	ArrayList<TimeInput> times = new ArrayList<TimeInput>();
	Scanner input;

	TimeManager(Scanner input) {
		this.input = input;
	}

	public void addtodolist() {
		int kind = 0;
		TimeInput timeInput;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Night:");
			System.out.println("2 for Dinner:");
			System.out.println("3 for Morning:");
			System.out.print("Select num 1,2, or 3 for Todo Kind:");
			kind = input.nextInt();
		

			if (kind == 1) {
				timeInput = new NightTime(TodolistKind.Night);
				timeInput.getUserInput(input);
				times.add(timeInput);
				break;

			} else if (kind == 2) {
				timeInput = new Dinnertime(TodolistKind.Dinner);
				timeInput.getUserInput(input);
				times.add(timeInput);
				break;
				
			} else if (kind == 3) {
				timeInput = new MorningTime(TodolistKind.Morning);
				timeInput.getUserInput(input);
				times.add(timeInput);
				break;

			} else {
				System.out.print("Select num for Todo Kind between 1 and 2:");
			}
		}

	}

	public void deletetodolist() {
		System.out.print("priority:");
		int priority = input.nextInt();
		int index = -1;
		for (int i = 0; i < times.size(); i++) {
			if (times.get(i).getPriority() == priority) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			times.remove(index);
			System.out.println("The todolist" + index + "is deleted!");
		} else {
			System.out.println("The todolist has not been registered!");
			return;
		}

	}

	public void edittodolist() {
		System.out.print("priority:");
		int priority = input.nextInt();
		for (int i = 0; i < times.size(); i++) {
			TimeInput timeInput = times.get(i);
			if (timeInput.getPriority() == priority) {
				int num = -1;
				while (num != 5) {
					System.out.println("*** Time Info Edit Menu***");
					System.out.println("1.Edit priority");
					System.out.println("2.Edit todo");
					System.out.println("3.Edit deadline");
					System.out.println("4.View memo");
					System.out.println("5.Exit");
					System.out.println("Select one number between 1 - 5:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Priority:");
						int newpriority = input.nextInt();
						timeInput.setPriority(newpriority);
					} else if (num == 2) {
						System.out.print("Todo");
						String todo = input.next();
						timeInput.setTodo(todo);
					} else if (num == 3) {
						System.out.print("Deadline");
						String deadline = input.next();
						timeInput.setDeadline(deadline);
					} else if (num == 4) {
						System.out.print("Memo");
						String memo = input.next();
						timeInput.setMemo(memo);
					} else {
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
		for (int i = 0; i < times.size(); i++) {
			times.get(i).printInfo();
		}
	}
}
	