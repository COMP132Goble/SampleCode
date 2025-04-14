package designPatterns;

import java.util.ArrayList;

public class Log {
    // singleton instance
	private static Log THE_LOG = new Log();

	private ArrayList<String> messages;

	// constructor is private so external code cannot create new Log
	// instances
	private Log() {
		messages = new ArrayList<String>();
	}

	public static Log getLog() {
		return THE_LOG;
	}

	public void addMessage(String message) {
		messages.add(message);
	}

	public void print() {
		for (String string : messages) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		getLog().addMessage("abc");
		getLog().addMessage("defg");
		getLog().print();
	}
}
