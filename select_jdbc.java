
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class select_jdbc {
    
    public static void main(String[] args) {
         //load the driver
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              //create connection

              String url="jdbc:mysql://localhost:3306/jdbc1";
              String username="root";
              
              Connection con=DriverManager.getConnection(url,username,"Hanu@@");

              //create a query

              String q="select * from table1";
                  
              // update table1 set tName=? , tCity=? , where tId=?  
               
               Statement smt=con.createStatement();

               ResultSet ans=smt.executeQuery(q);

               while(ans.next()){

                int id=ans.getInt(1);
                String name=ans.getString(2);
                 String city=ans.getString(3);

                 System.out.println(id + name + city);

               }
            //    System.out.println(ans);
              con.close();
              
              

         }catch(Exception e){
            e.printStackTrace();
         }
    }
}
 
