package timetime;

import java.util.Scanner;

public class Dinnertime extends Time implements TimeInput {

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

	public void printInfo() {
		String skind = "none";
		switch (this.kind) {
		case Morning:
			skind = "6-10";
			break;
		case Afternoon:
			skind = "11-15";
			break;
		case Dinner:
			skind = "16-20";
			break;
		case Night:
			skind = "21-24";
			break;
		default:

		}
		System.out.println("kind:" + skind + "" + "priority:" + priority + " " + "sleeptodo:" + todo + " "
				+ "sleepdeadline:" + deadline + " " + "sleepmemo:" + memo);
	}
}
