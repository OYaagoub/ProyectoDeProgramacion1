/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class BDTarjeta implements BaseDatosTarjeta{

    @Override
    public TarjetaBancaria GuardarTarjeta( Socio socio ) {
//       
//        TarjetaBancaria tarjetaBancaria1 = null ;
//        ResultSet rs = null;
//        PreparedStatement preparedStmt;
//        DefaultTableModel l = new DefaultTableModel();
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tacondeoro","root","");       
//            PreparedStatement preparedStmtCheck =con.prepareStatement("select idtarjeta,numero from tarjetabancaria,socio where idsocio=? and contrasenia=? LIMIT 1 ");
//            preparedStmtCheck.setString(1,"");
//            rs = preparedStmtCheck.executeQuery();
//           
//            if(rs.next() && rs.absolute(1) ){
//                            Socio1= new Socio(rs.getInt(1),rs.getString(2) ,rs.getString(3) ,rs.getString(4) ,rs.getString(5) ,rs.getString(6));
//                            
//                            
//                            
//                        }
//        } catch (Exception e) {
//            System.out.println(""+e.getMessage());
//        } finally {
//        }
//        
//        
//        
//    
//          return Socio1;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void RecuperarTarjeta(int idsocio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
