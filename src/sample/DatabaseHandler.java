package sample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }

    public void signUpUser (String name, String Surname, int course, String group, String Gender) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.STUDENT_TABLE +
                " (" + Const.STUDENT_NAME + ", " +
                Const.STUDENT_SURNAME + ", " +
                Const.STUDENT_COURSE +
                "," + Const.STUDENT_GROUP +
                ", " + Const.STUDENT_GENDER + ") " + "VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
        preparedStatement.setString(1, name );
        preparedStatement.setString(2, Surname );
        preparedStatement.setInt(3, course );
        preparedStatement.setString(4, group );
        preparedStatement.setString(5, Gender );
        preparedStatement.executeUpdate();


    }
}
