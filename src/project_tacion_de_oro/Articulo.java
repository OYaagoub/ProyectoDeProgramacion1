/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Articulo {


    private int id;
    private String nombre;
    private float precio;
    private String descripcion;
    private String material;
    private int  stock;
    private String fotografia;

    public Articulo() {
    }

    public Articulo(int id, String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.material = material;
        this.stock = stock;
        this.fotografia = fotografia;
    }

    public Articulo(String nombre, float precio, String descripcion, String material, int stock, String fotografia) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.material = material;
        this.stock = stock;
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFotografia() {
        return fotografia;
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", material=" + material + ", stock=" + stock + ", fotografia=" + fotografia + '}';
    }
    
    
}
