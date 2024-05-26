import java.sql.*;
// import com.mysql.jdbc.Driver;

class jdbc1{

    public static void main(String[] args) {
        
        try{
              //load the driver
              Class.forName("com.mysql.cj.jdbc.Driver");
              
              //create connection

              String url="jdbc:mysql://localhost:3306/jdbc1";
              String username="root";
              
              Connection con=DriverManager.getConnection(url,username,"Hanu@@");

            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection created");
            }
        }
        catch(Exception e){
             e.printStackTrace();
        }
    }
}