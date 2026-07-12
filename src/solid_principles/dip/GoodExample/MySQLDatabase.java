package solid_principles.dip.GoodExample;

public class MySQLDatabase implements Database {

    public void save() {
        System.out.println("Saved in MySQL");
    }
}
