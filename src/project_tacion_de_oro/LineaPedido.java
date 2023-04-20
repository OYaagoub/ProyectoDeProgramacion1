/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class LineaPedido  {
    private int idlineapedido;
    private int cantidad;

    public LineaPedido() {
    }

    public LineaPedido(int cantidad) {
        this.cantidad = cantidad;
    }

    public LineaPedido(int idlineapedido, int cantidad) {
        this.idlineapedido = idlineapedido;
        this.cantidad = cantidad;
    }
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "LineaPedido{" + "idlineapedido=" + idlineapedido + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
