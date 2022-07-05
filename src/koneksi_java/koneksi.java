/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private static Connection koneksikan;
    public static Connection getkoneksikan(){
        if(koneksikan==null){
            try {
               String url=new String();
               String user=new String();
               String password=new String();
               url="jdbc:mysql://localhost:3306/tokobuku";
               user="root";
               password="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksikan=DriverManager.getConnection(url,user,password);
                System.out.println("Koneksi berhasil");
            } catch (SQLException e) {
                System.err.println("Gagal membuat koneksi");
            }
        }
        return koneksikan;
    }
}
