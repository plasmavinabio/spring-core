package training.spring.lang.impl;
import training.spring.lang.Language;

public class English implements Language {
	public String getGreeting() {
		return "Hello";
	}
	public String getBye() {
		return "Bye bye";
	}
}
