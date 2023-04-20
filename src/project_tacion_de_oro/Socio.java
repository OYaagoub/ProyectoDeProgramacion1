/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

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
        

    public Socio(int id, String nombre, String correoE, String direccion, String poblacion) {
        this.id = id;
        this.nombre = nombre;
        this.correoE = correoE;
        this.direccion = direccion;
        this.poblacion = poblacion;
    }
    public void registrar(String nombre, String correoE, String direccion, String poblacion){
        
    }
    public void ModeficardatosPersonales(String nombre, String correoE, String direccion, String poblacion){
        
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

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", correoE=" + correoE + ", direccion=" + direccion + ", poblacion=" + poblacion + '}';
    }
    
        
}
