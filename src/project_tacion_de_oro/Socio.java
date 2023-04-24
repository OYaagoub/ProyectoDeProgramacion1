/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class Socio {
        private int  id;
        private String nombre;
	private String correoE;
	private String direccion;
	private String poblacion;
        private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Socio() {
    }
        
    public Socio(String nombre, String correoE, String direccion, String poblacion,String password) {
     
        this.nombre = nombre;
        this.correoE = correoE;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.password = password;
    }
    public Socio(String correoE, String password) {
        this.correoE = correoE;
        this.password = password;
        
    }
    public Socio(int id, String nombre, String correoE, String direccion, String poblacion,String password) {
        this.id = id;
        this.nombre = nombre;
        this.correoE = correoE;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.password = password;
    }
    public void registrar(String nombre, String correoE, String direccion, String poblacion,String password){
        Socio in = new Socio(nombre.trim(),correoE.trim(),direccion.trim(),poblacion.trim(),password.trim());
        DBsocio db = new DBsocio();
        db.ClienteRe(in);
    }
    public void ModeficardatosPersonales( int id, String nombre, String correoE, String direccion, String poblacion){
        
    }
    public void HacePedido(){
        
    }
    public void CancelarPedido(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
//public DefaultTableModel list(int i){
//        ResultSet rs = null;
//        PreparedStatement preparedStmt;
//        DefaultTableModel l = new DefaultTableModel();
//        Connection con = null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cashbackstore","root","");
//            switch (i) {
//                case 1:{
//                    l = new DefaultTableModel();
//                    
//                    l.addColumn("Nombre Producto");
//                    l.addColumn("Cantidad");
//                    l.addColumn("Importe Total");
//                    //asignamos el modelo de la vista tabla:
////                    tblPersonas.setModel(dtmPersonas);
////                    c= hazConexion();
////        
////            s=c.createStatement();
////            rs= s.executeQuery("select * from persona");
////                    while(rs.next()){
////                        Object [] fila= new Object[4];
////                        fila[0]=rs.getObject(1);// del resultSet obtengo la primera columna 
////                        fila[1]=rs.getObject(2);//columna del nombre
////                        fila[2]=rs.getObject(3);
////                        fila[3]=rs.getObject(4);
////                        l.addRow(fila);
////                    } 
//        
//                    preparedStmt =con.prepareStatement("select pedidos.*,productos.NUMBRE from pedidos,productos WHERE pedidos.ID_PRODUCTO=productos.ID_PRODUCTO  and pedidos.ID_PRODUCTO IN (SELECT productos.ID_PRODUCTO from productos WHERE productos.ID_PROVEEDOR_EMAIL =?)");
//                    preparedStmt.setString(1, pr.getEmail());
////                    preparedStmt.setString(1,"Pendiente" );
//                    rs = preparedStmt.executeQuery();
//                    
//                    break;
//                }
//                case 2:{
//                    
//                    l = new DefaultTableModel();
//                    // 	ID_PRODUCTO 
//                    l.addColumn("PRODUCTO");
//                    l.addColumn("ID REFERECIA");
//                    l.addColumn("FECHA PEDIDO");
//                    l.addColumn("FECHA ENTREGAR");
//                    l.addColumn("ESTADO");
//                    l.addColumn("CANTIDAD");
//                    l.addColumn("Importe Total");
//                    preparedStmt =con.prepareStatement("select productos.,productos.numbre,pedidos.* from pedidos,productos WHERE ESTADO = ? and ID_CLIENTE_EMAIL= ? and productos.ID_PRODUCTO=pedidos.ID_PRODUCTO ");
//                    preparedStmt.setString(2, cliente.getEmail());
//                    preparedStmt.setString(1,"Pendiente" );
//                    rs = preparedStmt.executeQuery();
//                    
//                    break;
//                }
//                case 3:{
//                    
//                    l = new DefaultTableModel();
//                    // 	ID_PRODUCTO 
//                    
//                    l.addColumn("ID REFERECIA");
//                    l.addColumn("nombre");
//                    l.addColumn("description");
//                    l.addColumn("ESTADO");
//                    l.addColumn("precioUnidad");
//                    l.addColumn("existencia");
//                    System.out.println("rg2w4gy2");
//                    preparedStmt =con.prepareStatement("select * from productos WHERE  ID_PROVEEDOR_EMAIL= ?  ");
//                    System.out.println("rg2w4gy2");
//                    preparedStmt.setString(1, pr.getEmail());
////                    preparedStmt.setString(1,"Pendiente" );
//                    rs = preparedStmt.executeQuery();
//                    System.out.println("rg2w4gy2");
//                    
//                    break;
//                }
//
//
//                default:
//                    throw new AssertionError();
//                
//            }
//            while(rs.next()){
//                
//                    //Producto pro = new Producto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6));
//                    if(i==1){
//                          Object [] DatosPedido= new Object[3];
//                          DatosPedido[0]=rs.getObject(9);
//                          DatosPedido[1]=rs.getObject(8);
//                          DatosPedido[2]=rs.getObject(5);
//                          l.addRow(DatosPedido);
//                          
////                        Pedidos ped= new Pedidos(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getInt(8));
////                        l.addElement(ped);
//                    }
//                    if(i==3){
//                        Object [] DatosPedido= new Object[6];
//                        DatosPedido[0]=rs.getObject(1);
//                        DatosPedido[1]=rs.getObject(2);
//                        DatosPedido[2]=rs.getObject(3);
//                        DatosPedido[3]=rs.getObject(5);
//                        DatosPedido[4]=rs.getObject(6);
//                        DatosPedido[5]=rs.getObject(7);
//         
//                        l.addRow(DatosPedido);
//                    }
//                    if(i==2){
//                        Object [] DatosPedido= new Object[7];
//                        DatosPedido[0]=rs.getObject(1);
//                        DatosPedido[1]=rs.getObject(2);
//                        DatosPedido[2]=rs.getObject(4);
//                        DatosPedido[3]=rs.getObject(5);
//                        DatosPedido[4]=rs.getObject(8);
//                        DatosPedido[5]=rs.getObject(9);
//                        DatosPedido[6]=rs.getObject(6);
//                        l.addRow(DatosPedido);
//                    }
//                    //
//            }
//            }catch(Exception e){
//                System.out.println("No podemos ");
//            }finally{
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println("no se puede cerrar");
//            }
//        }
//        
//        
//        return l;
//    }
//    public String ComandosSql(Object x ,int CodeSwitsh){
//        String message = null;
//        Connection con = null;
//        try{  
//            Class.forName("com.mysql.jdbc.Driver");
//            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cashbackstore","root","");  
//            
////            Statement stmt= con.createStatement();
////            ResultSet rs=stmt.executeQuery("select * from CLIENTES ");
//            switch (CodeSwitsh) {
//                case 1:{
//                    
//                    if( x instanceof Cliente){
//                        Cliente cl = (Cliente) x;
//                        ResultSet rs;
//                    
//                        PreparedStatement preparedStmtCheck =con.prepareStatement("select ID_EMAIL from CLIENTES where ID_EMAIL=? LIMIT 1 ");
//                        preparedStmtCheck.setString(1, cl.getEmail());
//                        rs = preparedStmtCheck.executeQuery();
//                        if(!rs.next()){
//                            PreparedStatement preparedStmt =con.prepareStatement("insert into CLIENTES (ID_EMAIL,PASSWOR_D,NOMBRE,APELLIDO,DERECTION,CP,CUIDAD)values(?,?,?,?,?,?,?) ");
//                            preparedStmt.setString(1, cl.getEmail());
//                            preparedStmt.setString(2, cl.getPassword());
//                            preparedStmt.setString(3, cl.getNombre());
//                            preparedStmt.setString(4, cl.getApellido());
//                            preparedStmt.setString(5, cl.getDereccion());
//                            preparedStmt.setInt(6, cl.getCp());
//                            preparedStmt.setString(7, cl.getCuidad());
//                            preparedStmt.execute();
//                            message="Ya esta registrado ";
//                        }else{
//                            message="Account existed";
//                        }
//                        
//                    }
//                    if( x instanceof Proveedor){
//                        Proveedor cl = (Proveedor) x;
//                        ResultSet rs;
//                        PreparedStatement preparedStmtCheck =con.prepareStatement("select ID_EMAIL from PROVEEDORES where ID_EMAIL=? LIMIT 1");
//                        preparedStmtCheck.setString(1, cl.getEmail());
//                        rs = preparedStmtCheck.executeQuery();
//                        if(!rs.next()){
//                            PreparedStatement preparedStmt =con.prepareStatement("insert into PROVEEDORES (ID_EMAIL,PASSWOR_D,NOMBRE,APELLIDO,DERECTION,CP,CUIDAD)values(?,?,?,?,?,?,?) ");
//                            preparedStmt.setString(1, cl.getEmail());
//                            preparedStmt.setString(2, cl.getPassword());
//                            preparedStmt.setString(3, cl.getNombre());
//                            preparedStmt.setString(4, cl.getApellido());
//                            preparedStmt.setString(5, cl.getDereccion());
//                            preparedStmt.setInt(6, cl.getCp());
//                            preparedStmt.setString(7, cl.getCuidad());
//                            preparedStmt.execute();
//                            message="Ya esta registrado ";
//                        }else{
//                            message="Account existed";
//                        }
//                        
//                        
//                        //preparedStmt.setDouble(8, cl.getDanados());
//
//                        
//                    }
//                    
//                    
//                    con.close();
//                    
//                    break;
//                }
//                    
//                case 2:{
//                    //boolean isAvailable;
//                    if(x instanceof Cliente){
//                        Cliente cl = (Cliente) x;
//                        System.out.println(cl);
//    //                  Statement stmt;
//                        ResultSet rs;
//    //                  stmt = con.createStatement();
//                        
//                        PreparedStatement preparedStmt =con.prepareStatement("select * from CLIENTES where ID_EMAIL = ? and PASSWOR_D=? LIMIT 1 ");
//                        preparedStmt.setString(1, cl.getEmail());
//                        preparedStmt.setString(2, cl.getPassword());
//    //                  String query="select * CLIENTES where (ID_EMAIL,PASSWOR_D)("+cl.getEmail()+","+cl.getPassword()+")";
//                        rs = preparedStmt.executeQuery();
//
//
//                        if(rs.next() && rs.absolute(1) ){
//                            cliente= new Cliente(rs.getString(1),rs.getString(2) ,rs.getString(3) ,rs.getString(4) ,rs.getString(5) ,rs.getString(7) ,rs.getInt(6));
//                            System.out.println(cl);
//                            ClienteDialogo pd= new ClienteDialogo(this, true);
//                            pd.setVisible(true);
//                            LoginSignUp lg= new LoginSignUp();
//                            lg.setVisible(false);
//                        }else{
//                             message="No existe";
//                        }
//                        
//                    }
//                    if(x instanceof Proveedor){
//                        Proveedor cl = (Proveedor) x;
//                        System.out.println(cl);
//    //                  Statement stmt;
//                        ResultSet rs;
//    //                  stmt = con.createStatement();
//                        
//                        PreparedStatement preparedStmt =con.prepareStatement("select * from PROVEEDORES where ID_EMAIL = ? and PASSWOR_D=? LIMIT 1");
//                        preparedStmt.setString(1, cl.getEmail());
//                        preparedStmt.setString(2, cl.getPassword());
//    //                  String query="select * CLIENTES where (ID_EMAIL,PASSWOR_D)("+cl.getEmail()+","+cl.getPassword()+")";
//                        rs = preparedStmt.executeQuery();
//                        
//
//                        if(rs.next() && rs.absolute(1) ){
//                                                          
//                            pr=new Proveedor(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7),rs.getDouble(8));
//                            System.out.println(pr);
//                            ProveedorDialog pd= new ProveedorDialog(this, true);
//                            pd.setVisible(true);
//                            
//                        }else{
//                             message="No existe";
//                        }
//                    }
//                    
//                    break;
//                }
//                case 3:{
//                    
//                    if( x instanceof Producto){
//                        ResultSet rs;
//                        Producto cl = (Producto) x;
//                        PreparedStatement preparedStmtCheck =con.prepareStatement("select NUMBRE from PRODUCTOS where NUMBRE=? and ID_PROVEEDOR_EMAIL = ? ");
//                        preparedStmtCheck.setString(1, cl.getNombre());
//                        preparedStmtCheck.setString(2, pr.getEmail());
//                        rs = preparedStmtCheck.executeQuery();
//                        if(!rs.next()){
//                            
//                            PreparedStatement preparedStmt =con.prepareStatement("insert into PRODUCTOS (NUMBRE,DESCRIPCION ,ID_PROVEEDOR_EMAIL ,ESTADO ,PRECIO_UNIDAD ,EXISTENCIA  )values(?,?,?,?,?,?) ");
//                            preparedStmt.setString(1, cl.getNombre());
//                            preparedStmt.setString(2, cl.getDescription());
//                            preparedStmt.setString(3, pr.getEmail());
//                            preparedStmt.setString(4, cl.getEstado());
//                            preparedStmt.setDouble(5, cl.getPrecioUnidad());
//                            preparedStmt.setInt(6, cl.getExistencia());
//                            preparedStmt.execute();
//                            message="esta almasinado ya!";
//                        }else{
//                            message="Existed ,lo tienes antes";
//                        }
//                        
//                    }
//                    
//                    break;
//                }
//                case 4:{
//                    
//                    if( x instanceof Producto){
//                        
//                        Producto cl = (Producto) x;
//                        
//                            PreparedStatement preparedStmt =con.prepareStatement("update PRODUCTOS set NUMBRE=?, DESCRIPCION=? , ESTADO=? , PRECIO_UNIDAD=? , EXISTENCIA=? where ID_PRODUCTO=? ");
//                            preparedStmt.setString(1, cl.getNombre());
//                            preparedStmt.setString(2, cl.getDescription());
//                            preparedStmt.setString(3, cl.getEstado());
//                            preparedStmt.setDouble(4, cl.getPrecioUnidad());
//                            preparedStmt.setInt(5, cl.getExistencia());
//                            preparedStmt.setInt(6, cl.getID_producto());
//                            preparedStmt.execute();
//                            message="esta actualizado";
//                        }else{
//                            message="you can't go it ,lo sinto";
//                        }
//                    break;
//                        
//                }
//                    
//                    
//                
//                
//                case 5:{
//
//                        if( x instanceof Producto){
//
//                            Producto cl = (Producto) x;
//
//                                PreparedStatement preparedStmt =con.prepareStatement("delete from PRODUCTOS where ID_PRODUCTO=? ");
//                                
//                                preparedStmt.setInt(1, cl.getID_producto());
//                                preparedStmt.execute();
//                                message="esta Hecho";
//
//                            }else{
//                                message="you can't go it ,lo sinto";
//                            }
//                            break;
//                }
//                default:
//                    message="no has elejedo";
//                    
//                    
//    }}
//                
//            
//            
//             
//
////            while(rs.next())  
////             System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+
////                     rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6)+" "+
////                     rs.getString(7));
//
//              
//   
//    catch(Exception e){
//            if(jr_iniciar.isSelected()){
//                message="invalido Correo o Contraseña" + e;
//                
//            }else if(jr_registrar.isSelected()){
//                message="No se puede usar mas de un correo a cada Cuenta" +e;
//            }
//            
//   }finally{
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println("no se puede cerrar");
//            }
//    }
//        
//        return message;
//    }
    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", correoE=" + correoE + ", direccion=" + direccion + ", poblacion=" + poblacion + '}';
    }
    
        
}
