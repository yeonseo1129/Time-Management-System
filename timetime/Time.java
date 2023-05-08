package timetime;

import java.util.Scanner;

public class Time {
	protected TodolistKind kind = TodolistKind.Night;
	protected int priority;
	protected String todo;
	protected String deadline;
	protected String memo;

	public Time() {
	}
	

	public Time(TodolistKind kind) {
		this.kind=kind;
	}

	public Time(int priority, String todo) {
		this.priority = priority;
		this.todo = todo;
	}

	public Time(int priority, String todo, String deadline, String memo) {
		this.priority = priority;
		this.todo = todo;
		this.deadline = deadline;
		this.memo = memo;
	}

	public Time(TodolistKind kind, int priority, String todo, String deadline, String memo) {
		this.kind = kind;
		this.priority = priority;
		this.todo = todo;
		this.deadline = deadline;
		this.memo = memo;
	}

	public TodolistKind getKind() {
		return kind;
	}

	public void setKind(TodolistKind kind) {
		this.kind = kind;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void printInfo() {
		String skind = "none";
		switch (this.kind) {
		case Morning:
			skind="6-10";
			break;
		case Afternoon:
			skind="11-15";
			break;
		case Dinner:
			skind="16-20";
			break;
		case Night:
			skind="21-24";
			break;
		default:

		}
		System.out.println("kind:"+skind+""+"priority:" + priority + " " + "todo:" + todo + " " + "deadline:" + deadline + " " + "memo:" + memo);
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

	public void getUserInput(Scanner input) {

	}

}





