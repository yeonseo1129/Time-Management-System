package timetime;

import java.util.Scanner;

public class NightTime extends Time implements TimeInput {

	public NightTime(TodolistKind kind) {
		super(kind);
	}

	public void geUsertInput(Scanner input) {
		System.out.print("priority:");
		int priority = input.nextInt();
		this.setPriority(priority);

		System.out.print("todo:");
		String todo = input.nextLine();
		this.setTodo(todo);

		System.out.print("deadline:");
		String deadline = input.nextLine();
		this.setDeadline(deadline);

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
