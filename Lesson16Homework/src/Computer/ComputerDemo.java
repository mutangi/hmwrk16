package Computer;

public class ComputerDemo {

	public static void main(String[] args) {

		Computer predator = new Computer(2001, 999.99, 1024, 512);
		Computer lenovo = new Computer(2015, 800, false, 2048, 1024, "Linux");
		Computer pravetz = new Computer(1991, 999.99, 64, 12);

	    predator.comparePrice(lenovo);
	   
	    pravetz.comparePrice(predator);
	    
	    System.out.println(predator.operationSystem);

	}

}

// Computer pravetz = new Computer();
// pravetz.year = 1995;
// pravetz.price = 99.99;
// pravetz.isNotebook = false;
// pravetz.hardDiskMemory = 256;
// pravetz.freeMemory = 512;
// pravetz.operationSystem = "Dos";
//
// Computer acer = new Computer();
// acer.year = 2015;
// acer.price = 600;
// acer.isNotebook = true;
// acer.hardDiskMemory = 1024;
// acer.freeMemory = 2048;
// acer.operationSystem = "Windos 10";
//
// pravetz.useMemory(100);
// acer.changeOperationSystem("Linux");
//
// System.out.println("�������� ������: ");
// System.out.println("������ �� ������������: " + pravetz.year+ "�.");
// System.out.println("����: " + pravetz.price + " $");
// System.out.println("�������� ��������?: " + pravetz.isNotebook);
// System.out.println("���� �� ������� ����: " + pravetz.hardDiskMemory + "
// gb");
// System.out.println("�������� �����: " + pravetz.freeMemory + " mb");
// System.out.println("����������� �������: " + pravetz.operationSystem);
//
// System.out.println();
//
// System.out.println("������ Acer: ");
// System.out.println("������ �� ������������: " + acer.year+ "�.");
// System.out.println("����: " + acer.price + " $");
// System.out.println("�������� ��������?: " + acer.isNotebook);
// System.out.println("���� �� ������� ����: " + acer.hardDiskMemory + " gb");
// System.out.println("�������� �����: " + acer.freeMemory + " mb");
// System.out.println("����������� �������: " + acer.operationSystem);
