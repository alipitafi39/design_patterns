package solid_principles.dip.GoodExample;

public class EmployeeService {
	    
	    private Database database;

	    public EmployeeService(Database database) {
	        this.database = database;
	    }

	    public void saveEmployee() {
	        database.save();
	    }
	    
}
