package Student;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void yearUp() {

		if (this.yearInCollege < 4) {
			this.yearInCollege++;
		}
		if (this.yearInCollege == 4) {
			this.isDegree = true;
			System.out.println(this.name + ", честито дипломиране!");
		}

	}

	double reciveScholarship(double min, double amount) {

		if (this.grade >= min && this.age < 30) {
			this.money += amount;

		}

		return this.money;
	}

}
