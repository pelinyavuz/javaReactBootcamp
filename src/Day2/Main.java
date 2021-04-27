package Day2;

public class Main {
	// OOP 24.04.2021

	public static void main(String[] args) {

		PersonInfo person1 = new PersonInfo(1, "123", "Karel", "Trevaskus", "98798798787",
				"ktrevaskus2@printfriendly.com", "983-271-3220", "Director of Sales");
		PersonInfo person2 = new PersonInfo(2, "456", "Matteo", "Cambridge", "3323798787", "mcambridge7@washington.edu",
				"463-569-9305", "Electrical Engineer");
		PersonInfo person3 = new PersonInfo(3, "798", "Kaila", "Massard", "98798798787", "gbernardinb@patch.com",
				"764-333-3276", "Graphic Designer");

		PersonInfo[] persons = { person1, person2, person3 };

		PersonManager personManager = new PersonManager();

		for (PersonInfo person : persons) {
			System.out.println(person.getEmployeeName() + " " + person.getEmployeeSurname());

			personManager.addToList(person);
		}

	}

}
