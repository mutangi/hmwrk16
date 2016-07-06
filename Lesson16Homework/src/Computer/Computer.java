package Computer;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win Xp";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.year = year;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;

	}

	int comparePrice(Computer c) {
		int x = 0;
		if (this.price > c.price) {
			x = -1;
			System.out.println(this.price + "$ е по-скъпа!");
		} else if (this.price < c.price) {
			x = 1;
			System.out.println(this.price + "$ е по-евтина!");
		} else {
			x = 0;
			System.out.println("Продуктите са на една и съща цена - " + this.price);
		}
		return x;
	}

	void changeOperationSystem(String newOperationSystem) {

		operationSystem = newOperationSystem;

	}

	void useMemory(double memory) {

		if (freeMemory < memory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}

	}

}

