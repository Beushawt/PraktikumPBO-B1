// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class MySQLPersonDAO implements PersonDAO {
//     public void savePerson(Person person) throws Exception{
//         String name = person.getName();
//         Class.forName("com.mysql.jdbc.Driver");
//         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
//         String query = "INSERT INTO person(name) VALUES('"+ name +"')";
//         System.out.println(query);
//         Statement s = con.createStatement();
//         s.executeUpdate(query);
//         con.close();
//     }
// }

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        Statement s = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "mirzafaiz123");
            // kerjakan mysql query
            String query = "INSERT INTO person(name) VALUES ('" + name + "')";
            System.out.println(query);
            s = con.createStatement();
            s.executeUpdate(query); // Use executeUpdate instead of executeQuery
        } finally {
            // tutup statement
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // tutup koneksi database
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}