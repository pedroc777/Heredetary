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
public class ConInterfaz extends Dispositivo {
    private String numSerie;
    private String tipoInterfazCarga;

    public ConInterfaz(String marca, String modelo, String color,
            float precio, String desc, String numSerie, String tipoInterfazCarga) {
        super(marca, modelo, color, precio, desc);
        this.numSerie = numSerie;
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getTipoInterfazCarga() {
        return tipoInterfazCarga;
    }

    public void setTipoInterfazCarga(String tipoInterfazCarga) {
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSerial Number: " + numSerie + 
                "\nCharging interface type: " + tipoInterfazCarga;
    }
    
    
}
