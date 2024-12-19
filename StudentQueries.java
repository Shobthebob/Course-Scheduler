
import java.sql.*;
import java.util.ArrayList;

public class StudentQueries {

    private static Connection connection;
    private static PreparedStatement addStudent;
    private static PreparedStatement dropStudent;
    private static PreparedStatement getStudents;
    private static PreparedStatement getID;
    private static PreparedStatement getIDs;
    private static PreparedStatement getName;
    private static ResultSet resultSet;

    public static void addStudent(String studentID, String firstName, String lastName) {
        connection = DBConnection.getConnection();
        try {
            addStudent = connection.prepareStatement("INSERT INTO app.student VALUES (?, ?, ?)");
            addStudent.setString(1, studentID);
            addStudent.setString(2, firstName);
            addStudent.setString(3, lastName);
            addStudent.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void dropStudent(String studentID){
        connection = DBConnection.getConnection();
        try{
            dropStudent = connection.prepareStatement("DELETE FROM APP.STUDENT WHERE STUDENTID=?");
            dropStudent.setString(1, studentID);
            dropStudent.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getStudents() {
        connection = DBConnection.getConnection();
        ArrayList<String> students = new ArrayList<String>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT studentID, firstname, lastname FROM app.student ORDER BY lastname ASC"
            );
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                students.add((rs.getString("lastname") + ", " + rs.getString("firstname") + "   (" + rs.getString("studentID") + ")").trim());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static ArrayList<Integer> getIDs() {
        connection = DBConnection.getConnection();
        ArrayList<Integer> IDs = new ArrayList<Integer>();
        try {
            getIDs = connection.prepareStatement("Select studentID from app.student order by studentid ASC");
            resultSet = getIDs.executeQuery();
            while (resultSet.next()) {
                IDs.add(Integer.parseInt(resultSet.getString(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IDs;
    }
    
    public static String getName(String studentID){
        String name = "";
        connection = DBConnection.getConnection();
        try {
            getName = connection.prepareStatement("SELECT firstName, lastName FROM APP.STUDENT WHERE STUDENTID=?");
            getName.setString(1, studentID);
            resultSet = getName.executeQuery();
            if (resultSet.next()) {
                name = resultSet.getString(1) + " " + resultSet.getString(2); 
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }
}
