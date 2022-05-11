package myvisual;
import java.sql.*;
import java.util.*;
public class StudImpl implements StudInterface {
public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Scanner sc = new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db1", "postgres", "883099");
        System.out.println("Coonection done");
        Statement stmt;
        stmt = conn.createStatement();

        System.out.println("Enter 1 For INSERT 2 for SELECT 3 for UPDATE 4 for DELETE 5 for EXIT");
        int choice;
        System.out.println("Enter Your Choice");
        choice = sc.nextInt();
        System.out.println("Enter Id");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        String sql;
        if (choice == 1) {
            sql = "insert into student values(" + id + ",'" + name + "')";
            stmt.executeUpdate(sql);
            System.out.println("RECORD INSERTED");
        } else if (choice == 2) {
            sql = "delete from student where id=" + id + "";
            stmt.executeUpdate(sql);
            System.out.println("RECORD DELETED");
        } else if (choice == 3) {
            sql = "update student set id=" + id + " where name=" + name + "";
            stmt.executeUpdate(sql);
            System.out.println("RECORD UPDATED");
        } else if (choice == 4) {
            sql = "select * from student";
            stmt.executeUpdate(sql);
            System.out.println("RECORD SELECTED");
        } else {
            System.out.println("Number is Out Of Bound");

        }

        System.out.println("ALL IS WELL");
        System.out.println("EVERYTHING IS FINE....");

        conn.close();

    }

    @Override
    public void insert(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void select(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public void EXIT(Student st) {
        // TODO Auto-generated method stub

    }

    @Override
    public Student getStud(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}