package Lecture1;

public class gradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 65;
		
		if (marks>=75) {
			System.out.println("Grade A");
		}
			else if (marks < 75 && marks >= 65) {
				System.out.println("Grade B");
			}
			else if (marks < 65 && marks >= 55) {
				System.out.println("Grade C");
			}
			else if (marks < 55 && marks >= 45) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Fail");			
			}
	}
}
