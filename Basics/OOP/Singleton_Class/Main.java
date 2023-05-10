package Singleton_Class;

public class Main {
    public static void main(String[] args) {
        Database db1;

        //refers to the only object of Database
        db1 = Database.getInstance();

        db1.getConnection();

        //if we would have a db2 object
        //we would still get the same database
        //object with the getInstance() method
    }
}
