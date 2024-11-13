import java.time.LocalDateTime;

public class Project {
	public static void main(String[] args) {
		Marine marine = new Marine
				(
						"Название военной части",
						"Название корабля",
						"Тип корабля",
						LocalDateTime.now(),
						100,
						1,
						"Место проведения учений",
						"Результат учений"
				);
		System.out.println(marine.toString());
	}
}