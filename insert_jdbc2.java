
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;

public class insert_jdbc2 {
    
    public static void main(String[] args) {
         //load the driver
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              //create connection

              String url="jdbc:mysql://localhost:3306/jdbc1";
              String username="root";
              
              Connection con=DriverManager.getConnection(url,username,"Hanu@@");

              //create a query

              String q="insert into table1(tName,tCity) values(?,?)";
                  
              // update table1 set tName=? , tCity=? , where tId=?  


              PreparedStatement pst=con.prepareStatement(q);

              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter Name : ");
              String name=br.readLine();

              System.out.println("Enter City : ");
              String city=br.readLine();

              pst.setString(1, name);
              pst.setString(2, city);
              
              //create statment
            //    Statement stmt=con.createStatement();
               pst.executeUpdate();
              System.out.println("Inserted..");

              con.close();
              
              

         }catch(Exception e){
            e.printStackTrace();
         }
    }
}
 
