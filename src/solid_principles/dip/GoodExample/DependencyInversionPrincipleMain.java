package solid_principles.dip.GoodExample;

public class DependencyInversionPrincipleMain {
	 public static void main(String[] args) {

	        Database database = new PostgreSQLDatabase();

	        EmployeeService service = new EmployeeService(database);

	        service.saveEmployee();
	 }
}
