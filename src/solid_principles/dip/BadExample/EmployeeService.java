package solid_principles.dip.BadExample;

public class EmployeeService {
	   private MySQLDatabase database = new MySQLDatabase();

	    public void saveEmployee() {
	        database.save();
	    }
}
