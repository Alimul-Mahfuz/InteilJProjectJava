

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    public static void main(String[] args) throws Exception,SQLException{
        String url = "jbdc:mysql://localhost:3309/contacts";
        String user = "root";
        String password = "2856";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String qry = "Select Contact_Name form myContacts where Cntid =3";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();

        ResultSet res = st.executeQuery(qry);
        res.next();
        String name = res.getString("Contact_Name");
        System.out.println(name);
        st.close();
        con.close();




    }
}