/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class EmpresaDeTransporte {
    private int id;
    private String nombre;
    private String CIF;
    private String domicilioFiscal;
    public EmpresaDeTransporte() {
    }

    public EmpresaDeTransporte(int id, String nombre, String CIF, String domicilioFiscal) {
        this.id = id;
        this.nombre = nombre;
        this.CIF = CIF;
        this.domicilioFiscal = domicilioFiscal;
    }
    
    public EmpresaDeTransporte(String nombre, String CIF, String domicilioFiscal) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.domicilioFiscal = domicilioFiscal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    @Override
    public String toString() {
        return "EmpresaDeTransporte{" + "id=" + id + ", nombre=" + nombre + ", CIF=" + CIF + ", domicilioFiscal=" + domicilioFiscal + '}';
    }

    
}
