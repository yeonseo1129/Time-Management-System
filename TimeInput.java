package timetime;

import java.util.Scanner;

public interface TimeInput {
	
	public void getUserInput(Scanner input);

	public int getPriority();

	public void setPriority(int priority);

	public void setTodo(String todo);

	public void setDeadline(String deadline);
	
	public void setMemo(String memo);

	public void printInfo();

}
