package Student;


public class College {

	public static void main(String[] args) {
		

		Student ivan = new Student("Ivan", "Право", 21);
		Student raya = new Student("Raya", "Право", 26);
		raya.grade = 6;
		Student kalin = new Student("Kalin", "Икономика", 40);
		Student tooOldForScholarship = new Student("Чичо Гошо", "право", 31);
		Student vasil = new Student("Vasil", "Право", 27);
		Student asq = new Student("Asq", "Право", 20);
		Student mariq = new Student("Mariq", "Право", 25);
		Student kiril = new Student("Kiril", "Право", 26);

		StudentGroup grupata = new StudentGroup("Право");
		grupata.addStudent(ivan);
		grupata.addStudent(kalin); // системата не приема Калин, понеже не е специланост "Право"
		grupata.addStudent(raya);
		grupata.addStudent(tooOldForScholarship);
		grupata.addStudent(asq);
		grupata.addStudent(vasil);
		grupata.addStudent(mariq); // Мария е 6-тия човек и няма място за нея :(
		grupata.addStudent(kiril);

		ivan.yearUp();
		ivan.reciveScholarship(3, 5);// Иван получава 5$, понеже покрива критерия за стипендия

		System.out.println("Иван: " + ivan.money + "$");
		System.out.println(ivan.yearInCollege);
		ivan.yearUp();
		ivan.yearUp(); // Иван се дипломира

		tooOldForScholarship.reciveScholarship(3, 100); // Чичо гошо не получава
														// стипендия, защото е
														// стар

		System.out.println("Чичо гошо: " + tooOldForScholarship.money + "$");
		// grupata.emptyGroup();
		// grupata.addStudent(mariq);// групата е празна и вече има място за Мария

		grupata.printStudentsInGroup(grupata.students);

		System.out.println(grupata.theBestStudent(grupata.students) + " има най-висок успех от випуска!");

	}

}
