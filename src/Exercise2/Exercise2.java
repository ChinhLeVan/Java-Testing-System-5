package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
	private ArrayList<Student> listStudents = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void createStudent() {
		Student student;
		System.out.print("Add name: ");
		String name = scanner.nextLine();
		System.out.println("Add group");
		int group = Integer.parseInt(scanner.nextLine());
		
		student = new Student(name, group);
		listStudents.add(student);
	}
	
	public void muster() {
		try {
			for (Student student : listStudents) {
				student.muster();
			}
		} catch (NullPointerException e) {
			System.out.println("list student null...");
		}
		
	}
	
	public void callGroup1ToLearn() {
		try {
			for (Student student : listStudents) {
				if(student.getGroup() == 1) {
					student.study();
				}
			}
		} catch (Exception e) {
			System.out.println("list student null...");
		}
	}
	
	public void callGroup2ToClear() {
		try {
			for (Student student : listStudents) {
				if(student.getGroup() == 2) {
					student.cleaning();
				}
			}
		} catch (NullPointerException e) {
			System.out.println("list student null...");
		}
	}
}
