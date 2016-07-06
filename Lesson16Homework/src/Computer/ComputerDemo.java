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
// System.out.println("Компютър Правец: ");
// System.out.println("Година на производство: " + pravetz.year+ "г.");
// System.out.println("Цена: " + pravetz.price + " $");
// System.out.println("Преносим компютър?: " + pravetz.isNotebook);
// System.out.println("Обем на твърдия диск: " + pravetz.hardDiskMemory + "
// gb");
// System.out.println("Свободна памет: " + pravetz.freeMemory + " mb");
// System.out.println("Операционна система: " + pravetz.operationSystem);
//
// System.out.println();
//
// System.out.println("Лаптоп Acer: ");
// System.out.println("Година на производство: " + acer.year+ "г.");
// System.out.println("Цена: " + acer.price + " $");
// System.out.println("Преносим компютър?: " + acer.isNotebook);
// System.out.println("Обем на твърдия диск: " + acer.hardDiskMemory + " gb");
// System.out.println("Свободна памет: " + acer.freeMemory + " mb");
// System.out.println("Операционна система: " + acer.operationSystem);
