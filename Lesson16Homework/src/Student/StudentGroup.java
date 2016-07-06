package Student;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String groupSubject) {
		this();
		this.groupSubject = "�����";
	}

	void addStudent(Student student) {
		if (freePlaces >= 1 && groupSubject.equalsIgnoreCase(student.subject)) {
			students[freePlaces - 1] = student;
			freePlaces--;
		} else if (freePlaces == 0) {
			System.out.println("���� ����� �� " + student.name);
		} else {
			System.out.println(student.name + " � �� ����� �����������!");
		}

	}

	void emptyGroup() {

		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent(Student[] students) {
		double maxGrade = 0;
		int maxGradeIndex = 0;
		String bestStudent = "";

		for (int i = 0; i < students.length; i++) {
			if (maxGrade < students[i].grade) {
				maxGrade = students[i].grade;
				maxGradeIndex = i;
				bestStudent = students[maxGradeIndex].name;
			}
		}
		return bestStudent;
	}

	void printStudentsInGroup(Student[] students) {

		for (int i = 0; i < students.length; i++) {
			System.out.println();
			System.out.println("��� " + students[i].name);
			System.out.println("������ " + students[i].age);
			System.out.println("����������� " + students[i].subject);
			System.out.println("�����: " + students[i].grade);
			System.out.println(students[i].name + " e " + students[i].yearInCollege + " ������ � ������.");
			System.out.println("������ �� " + students[i].money);
			System.out.println();
		}

	}
}
