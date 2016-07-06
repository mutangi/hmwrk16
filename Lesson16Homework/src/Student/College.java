package Student;


public class College {

	public static void main(String[] args) {
		

		Student ivan = new Student("Ivan", "�����", 21);
		Student raya = new Student("Raya", "�����", 26);
		raya.grade = 6;
		Student kalin = new Student("Kalin", "���������", 40);
		Student tooOldForScholarship = new Student("���� ����", "�����", 31);
		Student vasil = new Student("Vasil", "�����", 27);
		Student asq = new Student("Asq", "�����", 20);
		Student mariq = new Student("Mariq", "�����", 25);
		Student kiril = new Student("Kiril", "�����", 26);

		StudentGroup grupata = new StudentGroup("�����");
		grupata.addStudent(ivan);
		grupata.addStudent(kalin); // ��������� �� ������ �����, ������ �� � ����������� "�����"
		grupata.addStudent(raya);
		grupata.addStudent(tooOldForScholarship);
		grupata.addStudent(asq);
		grupata.addStudent(vasil);
		grupata.addStudent(mariq); // ����� � 6-��� ����� � ���� ����� �� ��� :(
		grupata.addStudent(kiril);

		ivan.yearUp();
		ivan.reciveScholarship(3, 5);// ���� �������� 5$, ������ ������� �������� �� ���������

		System.out.println("����: " + ivan.money + "$");
		System.out.println(ivan.yearInCollege);
		ivan.yearUp();
		ivan.yearUp(); // ���� �� ���������

		tooOldForScholarship.reciveScholarship(3, 100); // ���� ���� �� ��������
														// ���������, ������ �
														// ����

		System.out.println("���� ����: " + tooOldForScholarship.money + "$");
		// grupata.emptyGroup();
		// grupata.addStudent(mariq);// ������� � ������ � ���� ��� ����� �� �����

		grupata.printStudentsInGroup(grupata.students);

		System.out.println(grupata.theBestStudent(grupata.students) + " ��� ���-����� ����� �� �������!");

	}

}
