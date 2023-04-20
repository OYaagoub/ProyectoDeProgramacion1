/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Zapato extends Articulo{
    private String tipo;
    private float talla;

    public Zapato() {
    }

    public Zapato(String tipo, float talla) {
        this.tipo = tipo;
        this.talla = talla;
    }

    public Zapato(String tipo, float talla, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(nombre, precio, descripcion, material, stock, fotografia);
        this.tipo = tipo;
        this.talla = talla;
    }
        public Zapato(int id, String tipo, float talla, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        super(id,nombre, precio, descripcion, material, stock, fotografia);
        this.tipo = tipo;
        this.talla = talla;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }
    
    
}
