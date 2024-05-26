import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class save_image {
    public static void main(String[] args) {
        //load the driver
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             
             //create connection

             String url="jdbc:mysql://localhost:3306/jdbc1";
             String username="root";
             
             Connection con=DriverManager.getConnection(url,username,"Hanu@@");

             //create a query

             String q="insert into images(pic) values(?)";
             
             PreparedStatement pst=con.prepareStatement(q);
             
             FileInputStream fs=new FileInputStream("img.JFIF");

             pst.setBinaryStream(1, fs,fs.available());

             pst.executeUpdate();

             System.out.println("Done...............");

             con.close();
             
             

        }catch(Exception e){
           e.printStackTrace();
        }
   }

}
