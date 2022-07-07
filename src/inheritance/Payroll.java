package inheritance;

public class Payroll {

	public static void main(String[] args) {

		PermanentEmployee employee1 = new PermanentEmployee("Liam", "Neeson", 539482948, 74863);
		PermanentEmployee employee2 = new PermanentEmployee("Legolas", "Archer", 544766822, 81465);
		PermanentEmployee employee3 = new PermanentEmployee("Arragon", "Sword", 599755244, 98633);

		ContractEmployee employee4 = new ContractEmployee("Forrest", "Gump", 524587354, 22, 2080);
		ContractEmployee employee5 = new ContractEmployee("Michael", "Hitch", 528547342, 22, 2200);
		ContractEmployee employee6 = new ContractEmployee("Benedict", "Cumberbach", 583574935, 25, 2080);

		CommissionEmployee employee7 = new CommissionEmployee("Jai", "Shetty", 529056148, 40000, 50000);
		CommissionEmployee employee8 = new CommissionEmployee("Suresh", "Gopi", 52407356, 40000, 80000);
		CommissionEmployee employee9 = new CommissionEmployee("Fahad", "Fazil", 51385250, 40000, 150000);
		CommissionEmployee employee10 = new CommissionEmployee("Jagathy", "Sreekumar", 54380365, 40000, 100000);

		Employee[] employeeList = { employee1, employee2, employee3, employee4, employee5, employee6, employee7,
				employee8, employee9, employee10 };
	}

}
