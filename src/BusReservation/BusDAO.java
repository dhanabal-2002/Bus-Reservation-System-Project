package BusReservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
    public void DisplayBusInfo() throws SQLException {

        Connection con = DbConnection.getconnection();
        String str ="select * from bus";
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery(str);

        while (rs.next()){
            System.out.println("Bus No: "+ rs.getInt(1));
            if(rs.getInt(2)==0)
                System.out.println("AC: No");
            else System.out.println("AC: yes");
            System.out.println("Capacity: "+rs.getInt(3));
        }
        System.out.println("---------------------------------------------------------");
    }

    public int getCapacity(int id) throws SQLException {
        String query =" select capacity from bus where id ="+id;
        Connection con=DbConnection.getconnection();
        Statement st =con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);

    }

}
