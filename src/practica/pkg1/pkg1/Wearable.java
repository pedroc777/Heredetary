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
public class Wearable extends ConInterfaz {
    private String material;

    public Wearable(String marca, String modelo, String color, float precio,
            String desc, String numSerie, String tipoInterfazCarga, String material) {
        super(marca, modelo, color, precio, desc, numSerie, tipoInterfazCarga);
        this.material = material;
    }

    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMaterial: " + material + '}';
    }
    
    
}
