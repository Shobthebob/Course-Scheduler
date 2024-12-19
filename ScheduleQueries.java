
import java.sql.*;
import java.util.ArrayList;

public class ScheduleQueries {

    private static Connection connection;
    private static PreparedStatement addClass;
    private static PreparedStatement dropClass;
    private static PreparedStatement getSchedule;
    private static PreparedStatement getClasses;
    private static PreparedStatement getStatus;
    private static PreparedStatement updateStatus;
    private static PreparedStatement getList;
    private static ResultSet resultSet;

    static String status;
    
    public static void addClass(String studentID, String className, String status, String semester) {
        connection = DBConnection.getConnection();
        try {
            addClass = connection.prepareStatement("INSERT INTO app.schedule VALUES (?, ?, ?, ?)");
            addClass.setString(1, studentID);
            addClass.setString(2, className);
            addClass.setString(3, status);
            addClass.setString(4, semester);
            addClass.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    
    public static void dropClass(String studentID, String className, String semester){
        connection = DBConnection.getConnection();
        try {
            dropClass = connection.prepareStatement("DELETE FROM APP.SCHEDULE WHERE STUDENTID=? AND CLASS=? AND SEMESTER=?");
            dropClass.setString(1, studentID);
            dropClass.setString(2, className);
            dropClass.setString(3, semester);
            dropClass.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public static ArrayList<Object[]> getTable(String ID, String semester) {
        connection = DBConnection.getConnection();
        ArrayList<Object[]> schedule = new ArrayList<>();
        try {
            getClasses = connection.prepareStatement("SELECT class,status FROM APP.SCHEDULE where studentID=? AND semester=?");
            getClasses.setString(1, ID);
            getClasses.setString(2, semester);
            resultSet = getClasses.executeQuery();

            while (resultSet.next()) {
                schedule.add(new Object[]{resultSet.getString(1), resultSet.getString(2)});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return schedule;
    }

    public static boolean scheduled(String code, String ID, String semester) {
        // returns true if a student is scheduled for a class
        connection = DBConnection.getConnection();
        boolean isScheduled = false;
        try {
            getClasses = connection.prepareStatement("SELECT status FROM APP.SCHEDULE where class=? AND studentID=? AND semester=?");
            getClasses.setString(1, code);
            getClasses.setString(2, ID);
            getClasses.setString(3, semester);
            resultSet = getClasses.executeQuery();
            if (resultSet.next()) {
                if(resultSet.getString(1).equals("Scheduled")){
                    isScheduled = true; 
                }
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return isScheduled;
    }
    
    public static void updateStatus(String status, String code, String ID, String semester){
        connection = DBConnection.getConnection();
        try{
            updateStatus = connection.prepareStatement("UPDATE APP.SCHEDULE SET STATUS=? WHERE CLASS=? AND STUDENTID=? AND semester=?");
            updateStatus.setString(1, status);
            updateStatus.setString(2, code);
            updateStatus.setString(3, ID);
            updateStatus.setString(4, semester);
            updateStatus.executeUpdate(); 
        }
        catch(Exception e){
           e.printStackTrace(); 
        }
    }
    
    public static String getStatus(String code, String ID, String semester){
        connection = DBConnection.getConnection();
        try {
            getStatus = connection.prepareStatement("SELECT STATUS FROM APP.SCHEDULE where CLASS=? AND STUDENTID=? AND semester=?");
            getStatus.setString(1, code);
            getStatus.setString(2, ID);
            getStatus.setString(3, semester);
            resultSet = getStatus.executeQuery();
            if (resultSet.next()) {
                status = resultSet.getString(1); 
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    public static ArrayList<String> getWaitlisted(String code, String semester){
        connection = DBConnection.getConnection();
        ArrayList<String> list = new ArrayList<>();
        try{
            getList = connection.prepareStatement("SELECT STUDENTID FROM APP.SCHEDULE WHERE STATUS='Waitlisted' AND CLASS=? AND SEMESTER=?");
            getList.setString(1, code);
            getList.setString(2, semester);
            resultSet = getList.executeQuery();
            while(resultSet.next()) {
                list.add(resultSet.getString(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static ArrayList<Object[]> getData(String status, String code, String semester){
        connection = DBConnection.getConnection();
        ArrayList<Object[]> table = new ArrayList<>();
        try {
            getClasses = connection.prepareStatement("SELECT student.lastname, student.firstname, student.studentID FROM APP.SCHEDULE schedule JOIN APP.STUDENT student ON schedule.studentID = student.studentID WHERE schedule.status=? AND schedule.CLASS=? AND schedule.semester=?");
            getClasses.setString(1, status);
            getClasses.setString(2, code);
            getClasses.setString(3, semester);
            resultSet = getClasses.executeQuery();
            while (resultSet.next()) {
                table.add(new Object[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return table;
    }    
    
}
