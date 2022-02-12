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
public class Tablet extends ConInterfaz {
    private String compania;
    
    public Tablet(String marca, String modelo, String color, float precio,
            String desc, String numSerie, String tipoInterfazCarga, String compania) {
        super(marca, modelo, color, precio, desc, numSerie, tipoInterfazCarga);
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
        return super.toString() + "\nCompany:" + compania;
    }
    
    
    
}
