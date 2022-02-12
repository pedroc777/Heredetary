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
public class ConCompania extends Dispositivo {
    private String compania;

    public ConCompania(String marca, String modelo, String color,
            float precio, String desc, String compania) {
        super(marca, modelo, color, precio, desc);
        this.compania = compania;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCompany: " + compania;
    }

    
    
    
    
}
