/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;

/**
 *
 * @author usuario
 */
public class Ruta {
    private int id;
    private String areaInfluencia;
    private String diasReparto;
    
    public Ruta() {
    }

    public Ruta(int id, String areaInfluencia, String diasReparto) {
        this.id = id;
        this.areaInfluencia = areaInfluencia;
        this.diasReparto = diasReparto;
    }

    public Ruta(String areaInfluencia, String diasReparto) {
        this.areaInfluencia = areaInfluencia;
        this.diasReparto = diasReparto;
    }

    public String getAreaInfluencia() {
        return areaInfluencia;
    }

    public void setAreaInfluencia(String areaInfluencia) {
        this.areaInfluencia = areaInfluencia;
    }

    public String getDiasReparto() {
        return diasReparto;
    }

    public void setDiasReparto(String diasReparto) {
        this.diasReparto = diasReparto;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", areaInfluencia=" + areaInfluencia + ", diasReparto=" + diasReparto + '}';
    }

    
    
}
