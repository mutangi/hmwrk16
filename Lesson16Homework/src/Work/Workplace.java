package Work;

public class Workplace {

	public static void main(String[] args) {

		Employee ivan = new Employee("����");

		// ����� ��� �� ������
		ivan.setHoursLeft(8);
		ivan.work();
		ivan.showReport();

		// ����� ��� �� ������
		ivan.setHoursLeft(-1); // ��������� ��������, ���-�� �������� �� 4
		System.out.println();
		ivan.work();
		ivan.showReport();

		// ����� ��� - �������� � ��������� � ���� �� ������ �������
		System.out.println();
		ivan.setHoursLeft(9);
		ivan.work();
		ivan.showReport();
	}

}
