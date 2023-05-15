package timetime;

import java.util.Scanner;

public class Dinnertime extends Time {
	
	public Dinnertime(TodolistKind kind) {
		super(kind);
	}
	
	public void geUserInput(Scanner input) {
		System.out.print("priority:");
		int priority = input.nextInt();
		this.setPriority(priority);

		System.out.print("todo:");
		String todo = input.nextLine();
		this.setTodo(todo);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Does it has deadline? (Y/N)?");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("deadline:");
				String deadline = input.nextLine();
				this.setDeadline(deadline);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setDeadline("");
				break;
			} else {
			}
		}
		System.out.print("memo:");
		String memo = input.nextLine();
		this.setMemo(memo);
	}
}

