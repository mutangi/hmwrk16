package Work;

public class Employee {
	private String name;
	private Task currentTask = new Task();
	private double hoursLeft;

	public Employee(String name) {
		this.name = name;
		if (name.isEmpty()) {
			this.name = "robot";
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty()) {
			this.name = "robot";
		} else {
			this.name = name;
		}

	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		} else {
			setHoursLeft(4);
		}

	}

	public void work() {

		if (hoursLeft > currentTask.getWorkingHours()) {
			hoursLeft -= currentTask.getWorkingHours();
			currentTask.setWorkingHours(0);

		} else if (hoursLeft == currentTask.getWorkingHours()) {
			hoursLeft = 0;
			currentTask.setWorkingHours(0);

		} else {
			double x = currentTask.getWorkingHours() - hoursLeft;
			currentTask.setWorkingHours(x);
			hoursLeft = 0;

		}

	}

	public void showReport() {
		System.out.println("Служител: " + getName());
		System.out.println("Задача за деня: " + currentTask.getName());
		System.out.println("Работни часове оставащи за деня: " + this.hoursLeft + " ч.");
		System.out.println("Оставащи часове до довършване на задачата " + currentTask.getWorkingHours());
	}

}
