package solid_principles.srp.GoodExample;

public class SingleResponsibilityPrincipleMain {

	public static void main(String[] args) {
		   Employee emp = new Employee("Ali", 100000);

	        SalaryService salaryService = new SalaryService();
	        EmployeeRepository repository = new EmployeeRepository();
	        ReportService reportService = new ReportService();

	        System.out.println(salaryService.calculateSalary(emp));

	        repository.save(emp);

	        reportService.generate(emp);
	}

}
