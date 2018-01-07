package training.spring.lang.impl;
import training.spring.lang.Language;

public class Vietnamese implements Language {
	public String getGreeting() {
		return "Xin chao";
	}
	public String getBye() {
		return "Tam biet";
	}
}
