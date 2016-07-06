package Work;

public class Workplace {

	public static void main(String[] args) {

		Employee ivan = new Employee("Иван");

		// първи ден на работа
		ivan.setHoursLeft(8);
		ivan.work();
		ivan.showReport();

		// втори ден на работа
		ivan.setHoursLeft(-1); // невалидна стойност, сет-ва часовете на 4
		System.out.println();
		ivan.work();
		ivan.showReport();

		// трети ден - задачата е изпълнена и Иван си тръгва доволен
		System.out.println();
		ivan.setHoursLeft(9);
		ivan.work();
		ivan.showReport();
	}

}
