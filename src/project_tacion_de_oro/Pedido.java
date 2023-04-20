/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Pedido {
    private String fecha;
    private float total;

    public Pedido(String fecha, float total) {
        this.fecha = fecha;
        this.total = total;
    }

    public Pedido() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public static void calcularTotal(){
        
    }
    public static void añadirArticulo(Articulo articulo){
        
    }
    public static void asignarRuta(){
        
    }
    public static void calcularFechaSalida(){
        
    }

    @Override
    public String toString() {
        return "Pedido{" + "fecha=" + fecha + ", total=" + total + '}';
    }
    
    
}
