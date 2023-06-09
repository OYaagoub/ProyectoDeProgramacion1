/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

import Ventanas.*;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class DBsocio implements Database{
    DefaultTableModel l;
    @Override
    public Socio ClienteIn(Socio socio ) {
        Socio Socio = socio ;
        Socio Socio1 = null ;
        ResultSet rs = null;
        PreparedStatement preparedStmt;
        DefaultTableModel l = new DefaultTableModel();
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7614373","root",""); 
            
            PreparedStatement preparedStmtCheck =con.prepareStatement("select * from socio where correo=? and contrasenia=? LIMIT 1 ",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            preparedStmtCheck.setString(1, Socio.getCorreoE());
            preparedStmtCheck.setString(2, Socio.getPassword());
            rs = preparedStmtCheck.executeQuery();
           
            if(rs.next() && rs.absolute(1) ){
                Socio1= new Socio(rs.getInt(1),rs.getString(2) ,rs.getString(3) ,rs.getString(4) ,rs.getString(5) ,rs.getString(6));
                            
                            
                            
                        }
        } catch (Exception e) {
            String a=""+e.getMessage();
            Component RegistrarIniciarSesion = null;
            JOptionPane.showMessageDialog(RegistrarIniciarSesion,a );
            System.out.println(""+e.getMessage());
        } finally {
        }
        
        
        
    
    return Socio1;
}

    @Override
    public void ClienteRe(Socio socio) {
        Socio Socio = socio ;
        Socio Socio1 = null ;
        ResultSet rs = null;
        PreparedStatement preparedStmt;
        DefaultTableModel l = new DefaultTableModel();
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");;
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7614373","root","");       
            PreparedStatement preparedStmtCheck =con.prepareStatement("select * from socio where correo=? and contrasenia=? LIMIT 1 ");
            preparedStmtCheck.setString(1, Socio.getCorreoE());
            preparedStmtCheck.setString(2, Socio.getPassword());
            rs = preparedStmtCheck.executeQuery();
           
            if(!rs.next()){
                preparedStmt =con.prepareStatement("insert into socio (nombre,correo,direccion,poblacion,contrasenia)values(?,?,?,?,?) ");
                preparedStmt.setString(1, Socio.getNombre());
                preparedStmt.setString(2, Socio.getCorreoE());
                preparedStmt.setString(3, Socio.getDireccion());
                preparedStmt.setString(4, Socio.getPoblacion());
                preparedStmt.setString(5, Socio.getPassword());            
                preparedStmt.execute();
//                ------------------------------------------
                Component RegistrarIniciarSesion = null;
                JOptionPane.showMessageDialog(RegistrarIniciarSesion,"ya esta registrado" );
//                ------------------------------------------
                
            }
        } catch (Exception e) {
            System.out.println("" +e.getMessage());
        } finally {
        }
        
    }
    @Override
    public void ClienteModificar(Socio socio) {
        Socio Socio = socio ;
        
        ResultSet rs = null;
        PreparedStatement preparedStmt;
        DefaultTableModel l = new DefaultTableModel();
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7614373","root","");       
            
           
            
                preparedStmt =con.prepareStatement("update  socio set nombre=?,correo=?,direccion=?,poblacion=?,contrasenia=? where  idsocio=? ");
                preparedStmt.setString(1, Socio.getNombre());
                preparedStmt.setString(2, Socio.getCorreoE());
                preparedStmt.setString(3, Socio.getDireccion());
                preparedStmt.setString(4, Socio.getPoblacion());
                preparedStmt.setString(5, Socio.getPassword());  
                preparedStmt.setInt(6, Socio.getId()); 
                preparedStmt.execute();
                Component MisDatos = null;
                JOptionPane.showMessageDialog(MisDatos,"ya esta actualizado" );
                
            
        } catch (Exception e) {
            System.out.println("" +e.getMessage());
        } finally {
        }
        
    }

    
    
}
