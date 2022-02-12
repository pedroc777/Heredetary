/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1.pkg1;

/**
 *
 * @author pedro
 */
public class Celular extends ConCompania {
    private String imei;

    public Celular(String marca, String modelo, String color,
            float precio, String desc, String compania, String imei) {
        super(marca, modelo, color, precio, desc, compania);
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIMEI: " + imei;
    }
    
    
}
