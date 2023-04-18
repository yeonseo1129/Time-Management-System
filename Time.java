package timetime;

public class Time {
	int priority;
	String todo;
	String deadline;
	String memo;
	
	public Time() {
		
	}

	public Time(int priority, String todo, String deadline, String memo) {
	    this.priority = priority;
	    this.todo = todo;
	    this.deadline = deadline;
	    this.memo = memo;
	}
	public void printInfo() {
		System.out.println("priority:"+priority+" "+"todo:"+todo+" "+"deadline:"+deadline+" "+"memo:"+memo);
	}

	}


