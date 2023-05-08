/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Bolso extends Articulo{
    private String tipo;

    public Bolso() {
    }

    public Bolso(String tipo) {
        this.tipo = tipo;
    }

    public Bolso(String tipo, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(nombre, precio, descripcion, material, stock, fotografia);
        this.tipo = tipo;
    }
    public Bolso( int id, String tipo, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(id, nombre, precio, descripcion, material, stock, fotografia);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bolso{" + "tipo=" + tipo + '}';
    }
    
}
