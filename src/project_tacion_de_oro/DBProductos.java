/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class DBProductos {
    public DefaultTableModel recuperarArticulos(){
        DefaultTableModel l = new DefaultTableModel();
                    // 	ID_PRODUCTO 
                    l.addColumn("idarticulo");
                    l.addColumn("nombre");
                    l.addColumn("precio");
                    l.addColumn("descripcion");
                    l.addColumn("material");
                    l.addColumn("stock");
                    l.addColumn("fotografia");
                    l.addColumn("tipo de articulo");
                    l.addColumn("numerozapato");
                    l.addColumn("tallacomplemento");
                    
    
    
        
        ResultSet rs = null;
        PreparedStatement preparedStmt;
        
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sql7614373","root",""); 
            
            PreparedStatement preparedStmtCheck =con.prepareStatement("select * from articulo  ",ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            rs = preparedStmtCheck.executeQuery();
           
            if(rs.next() ){
                Object [] DatosPedido= new Object[10];
                        DatosPedido[0]=rs.getObject(1);
                        DatosPedido[1]=rs.getObject(2);
                        DatosPedido[2]=rs.getObject(3);
                        DatosPedido[3]=rs.getObject(4);
                        DatosPedido[4]=rs.getObject(5);
                        DatosPedido[5]=rs.getObject(6);
                        DatosPedido[6]=rs.getObject(7);
                        DatosPedido[7]=rs.getObject(8);
                        DatosPedido[8]=rs.getObject(9);
                        DatosPedido[9]=rs.getObject(10);
                        
                        
                        l.addRow(DatosPedido);
                            
                            
                            
                        }
        } catch (Exception e) {
            String a=""+e.getMessage();
            
            JOptionPane.showMessageDialog(null,a );
            
        } finally {
        }
        
        
        
    
    return l;
}
}

