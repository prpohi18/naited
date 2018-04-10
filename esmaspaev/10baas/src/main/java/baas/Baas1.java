package baas;
import java.sql.*;
public class Baas1{
    public static void main(String[] arg) throws Exception{        
        System.out.println("Argumente: "+arg.length);
        Connection cn=DriverManager.getConnection(
             "jdbc:mysql://localhost/if17_jaagup_1?user=if17&password=if17");
        if(arg.length==2){
          Lisamine.lisa(cn, arg);
        }
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT id, raadius, mass FROM kapsad");
        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getDouble("raadius")+" "+rs.getDouble("mass"));
        }
    }
}

/*
java -jar target/boot3-1.jar 7 1300
Argumente: 2
1 8.0 1200.0
2 9.5 1400.0
3 5.2 750.0
4 5.2 750.0
5 5.2 750.0
6 5.2 750.0
7 6.0 1300.0
8 5000.0 12000.0
9 6.0 1300.0
10 5.0 2.0
11 7.0 1300.0

*/