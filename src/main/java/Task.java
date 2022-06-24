import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task {
    public static void main( String[] args )
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:my.db");

            String createTable = "CREATE TABLE car (ID INTEGER PRIMARY KEY AUTOINCREMENT ,brand TEXT NOT NULL, model TEXT NOT NULL, color TEXT NOT NULL)";
            String insertInto = "INSERT INTO car (brand, model, color) VALUES ('TOYOTA', 'Camry','Black')";

            Statement statement = co.createStatement();
            statement.executeUpdate(createTable);
            statement.executeUpdate(insertInto);


        }catch (Exception e) {
            System.out.println(e);
        }
    }
}

