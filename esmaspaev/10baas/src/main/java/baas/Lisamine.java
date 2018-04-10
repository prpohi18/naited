package baas;
import java.sql.*;
public class Lisamine{
    public static void lisa(Connection cn, String[] arg) throws Exception{        
        PreparedStatement st=cn.prepareStatement("INSERT INTO kapsad VALUES(DEFAULT, ?, ?)");
        st.setDouble(1, Double.parseDouble(arg[0]));
        st.setDouble(2, Double.parseDouble(arg[1]));
        st.executeUpdate();
    }
}