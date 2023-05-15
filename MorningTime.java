package timetime;

import java.util.Scanner;

public class MorningTime extends Time {
	protected String sleepTodo;
	protected String sleepDeadline;

	public MorningTime(TodolistKind kind) {
		super(kind);
	}

	public void geUserInput(Scanner input) {
		System.out.print("todo:");
		String todo = input.nextLine();
		this.setTodo(todo);

		System.out.print("deadline:");
		String deadline = input.nextLine();
		this.setDeadline(deadline);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Is it until sleep time?(Y/N)?");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("wake up time:");
				String newDeadline = input.nextLine();
				this.setDeadline(newDeadline);
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
