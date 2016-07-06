package Work;

public class Task {

	private String name;
	private double workingHours;

	public Task() {
		name = "Смени гумите на колата!";
		workingHours = 20;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

}
