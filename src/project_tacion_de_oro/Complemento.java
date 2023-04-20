/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Complemento extends Articulo {
    private int talla;

    public Complemento() {
    }

    public Complemento(int talla) {
        this.talla = talla;
    }

    public Complemento(int talla, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(nombre, precio, descripcion, material, stock, fotografia);
        this.talla = talla;
    }
        public Complemento( int id, int talla, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(id, nombre, precio, descripcion, material, stock, fotografia);
        this.talla = talla;
    }


    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
}
