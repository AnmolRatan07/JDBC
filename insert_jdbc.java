
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_jdbc {
    
    public static void main(String[] args) {
         //load the driver
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              //create connection

              String url="jdbc:mysql://localhost:3306/jdbc1";
              String username="root";
              
              Connection con=DriverManager.getConnection(url,username,"Hanu@@");

              //create a query

              String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
              
              //create statment
               Statement stmt=con.createStatement();
               stmt.executeUpdate(q);
              System.out.println("table created..");

              con.close();
              
              

         }catch(Exception e){
            e.printStackTrace();
         }
    }
}
