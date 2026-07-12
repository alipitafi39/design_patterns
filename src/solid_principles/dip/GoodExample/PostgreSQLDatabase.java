package solid_principles.dip.GoodExample;

public class PostgreSQLDatabase implements Database {

    public void save() {
        System.out.println("Saved in PostgreSQL");
    }
}
