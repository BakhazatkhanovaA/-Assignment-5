import java.sql.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Hello {


            public static void main(String[]argv) throws SQLException {

                System.out.println("-------- PostgreSQL "
                        + "JDBC Connection Testing ------------");

                try {

                    Class.forName("org.postgresql.Driver");

                } catch (ClassNotFoundException e) {

                    System.out.println("Where is your PostgreSQL JDBC Driver? "
                            + "Include in your library path!");
                    e.printStackTrace();
                    return;

                }

                System.out.println("PostgreSQL JDBC Driver Registered!");

                Connection connection = null;

                try {

                    connection = DriverManager.getConnection(
                            "jdbc:postgresql://127.0.0.1:5432/postgres", "admins",
                            "291207");

                } catch (SQLException e) {

                    System.out.println("Connection Failed! Check output console");
                    e.printStackTrace();
                    return;

                }

                if (connection != null) {
                    System.out.println("You made it, take control your database now!");
                    Statement statement = connection.createStatement();
                    System.out.println("Reading car records...");}}}
                   /* System.out.println("user | password");
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM public.account");
                    while (resultSet.next()) {
                        System.out.printf("%-30.30s  %-30.30s%n", resultSet.getString("username"), resultSet.getString("password"));
                    }
                    connection.close();
                } else {
                    System.out.println("Failed to make connection!");
                }
            }

        }
*/