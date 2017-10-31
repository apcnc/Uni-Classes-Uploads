package de.unistuttgart.iaas.pse.ex01.p3;

import java.util.Map;

public class EmailManagement {
	Map<String, String> test;
	public void add(String name, String email) {
		
		test.put(name, email);
	}

	public void printAll() {
		System.out.println(test.entrySet().toString());
	}

	public static void main(String[] args) {
		// to test both methods
		EmailManagement management = new EmailManagement();
		management.add("Albert Schmidt", "albert.schmidt@gmx.de");
		management.add("Max Heselbach", "max.heselbach@gmx.de");
		management.add("Berta Weber", "berta.weber@gmx.de");

		management.printAll();
	}

}
