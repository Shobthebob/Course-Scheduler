
import java.sql.*;
import java.util.ArrayList;

public class CourseQueries {

    private static Connection connection;
    private static PreparedStatement addCourse;
    private static PreparedStatement dropCourse;
    private static PreparedStatement getCourses;
    private static PreparedStatement updateSeats;
    private static PreparedStatement getSeats;
    private static ResultSet resultSet;

    static int seats;

    public static void addCourse(String code, String description, String semester) {
        connection = DBConnection.getConnection();
        try {
            addCourse = connection.prepareStatement("INSERT INTO app.course VALUES (?, ?, ?, ?)");
            addCourse.setString(1, code);
            addCourse.setString(2, description);
            addCourse.setString(3, semester);
            addCourse.setString(4, null);
            addCourse.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void dropCourse(String code, String semester){
        connection = DBConnection.getConnection();
        try {
            dropCourse = connection.prepareStatement("DELETE FROM APP.COURSE WHERE CODE=? AND SEMESTER=?");
            dropCourse.setString(1, code);
            dropCourse.setString(2, semester);
            dropCourse.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getCourses(String semester) {
        connection = DBConnection.getConnection();
        ArrayList<String> courses = new ArrayList<>();
        try {
            getCourses = connection.prepareStatement("SELECT code FROM app.course WHERE SEMESTER=? ORDER BY code ASC");
            getCourses.setString(1, semester);
            resultSet = getCourses.executeQuery();
            while (resultSet.next()) {
                courses.add(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }

    public static ArrayList<Object[]> getTable(String semester) {
        connection = DBConnection.getConnection();
        ArrayList<Object[]> entries = new ArrayList<Object[]>();
        try {
            getCourses = connection.prepareStatement("SELECT code,description,seats FROM app.course WHERE SEMESTER=? ORDER BY code ASC");
            getCourses.setString(1, semester);
            resultSet = getCourses.executeQuery();
            while (resultSet.next()) {

                if (resultSet.getString(3) == null) {
                    entries.add(new Object[]{resultSet.getString(1), resultSet.getString(2), "to be decided"});
                } else {
                    entries.add(new Object[]{resultSet.getString(1), resultSet.getString(2), Integer.parseInt(resultSet.getString(3))});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entries;
    }

    public static int getSeats(String code, String semester) {
        connection = DBConnection.getConnection();
        try {
            getSeats = connection.prepareStatement("SELECT SEATS FROM APP.COURSE WHERE CODE=? AND Semester=?");
            getSeats.setString(1, code);
            getSeats.setString(2, semester);
            resultSet = getSeats.executeQuery();
            if (resultSet.next()) {
                seats = resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return seats;
    }

    public static void updateSeats(String code, String semester, int seats) {
        connection = DBConnection.getConnection();
        try {
            updateSeats = connection.prepareStatement("UPDATE APP.COURSE SET SEATS=? WHERE CODE=? AND SEMESTER=?");
            updateSeats.setString(1, Integer.toString(seats));
            updateSeats.setString(2, code);
            updateSeats.setString(3, semester);
            updateSeats.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
