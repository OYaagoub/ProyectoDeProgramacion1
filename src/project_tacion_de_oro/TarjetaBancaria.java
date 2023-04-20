/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_tacion_de_oro;


/**
 *
 * @author usuario
 */
public class TarjetaBancaria {
    
    private String numero;
    private int id;
    
    public TarjetaBancaria() {
    }

    public TarjetaBancaria(String numero, int id) {
        this.numero = numero;
        this.id = id;
    }

    public TarjetaBancaria(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "TarjetaBancaria{" + "numero=" + numero + ", id=" + id + '}';
    }

    
    
    public boolean comprobarValidez(String a) {
        boolean r = false;
        int sum = 0;
        int size = a.length();
        
        for (int i = size - 1; i >= 0; i--) {
            
            int numeroseparado = Integer.parseInt(a.substring(i, i + 1));
            if ((a.length() - i) % 2 == 0) {
                numeroseparado = numerodoble(numeroseparado);
            }
            sum += numeroseparado;
        }
        if (sum % 10 == 0){
            r = true;
        }
        
        return r;
    }
    private static int numerodoble(int numeroseparado) {
        int num = numeroseparado * 2;
        if (num > 9) {
            num = numeroseparado - 9;
        }
        return num;
    }
}
