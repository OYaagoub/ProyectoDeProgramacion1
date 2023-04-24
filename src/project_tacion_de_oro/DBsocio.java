/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class DBsocio implements Database{
    DefaultTableModel l;
    @Override
    public Socio Cliente(int i,Socio socio ) {
        Socio Socio = socio ;
        ResultSet rs = null;
        PreparedStatement preparedStmt;
        DefaultTableModel l = new DefaultTableModel();
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cashbackstore","root","");       
            PreparedStatement preparedStmtCheck =con.prepareStatement("select * from socio where correo? contrasenia=? LIMIT 1 ");
            preparedStmtCheck.setString(1, Socio.getCorreoE());
            preparedStmtCheck.setString(2, Socio.getPassword());
            rs = preparedStmtCheck.executeQuery();
           
            if(rs.next() && rs.absolute(1) ){
                            Socio= new Socio(rs.getInt(1),rs.getString(2) ,rs.getString(3) ,rs.getString(4) ,rs.getString(5) ,rs.getString(6));

                            
                            
                        }else{
                             
                        }
        } catch (Exception e) {
            
        } finally {
        }
        
        
        
    
    return Socio;
}
    
}
