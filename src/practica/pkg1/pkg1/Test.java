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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablet t = new Tablet("Samung", "Galaxy Tab 7", "Negro", 10499.00f, 
                "Tablet", "134251452342", "USB", "Telcel");
        Tablet t1 = new Tablet("Samung", "Galaxy Tab 8", "Negro", 11499.00f, 
                "Tablet", "98677563244", "USB", "Telcel");
        
        System.out.println("Tablet 1: " + t.toString());
        System.out.println("\nTablet 2: " + t1.toString());
        
        Celular c = new Celular("Apple", "iPhone X", "Negro", 20000.00f,
                "Smart phone", "AT&T", "010928/00/389023/3");
        Celular c1 = new Celular("Apple", "iPhone 11", "Negro", 20000.00f,
                "Smart phone", "Movistar", "010928/00/389023/4");
        
        System.out.println("\nCelular 1: " + c.toString());
        System.out.println("\nCelular 2: " + c1.toString());
        
        Wearable w = new Wearable("Apple", "Apple Watch", "Blanco", 499.99f,
                "Reloj", "874392", "USB", "Aluminio"); 
        Wearable w1 = new Wearable("Samsung", "Samsung Watch", "Negro", 399.99f,
                "Reloj", "45678987654", "USB", "Fibra de carbono");
        
        System.out.println("\nWearable 1: " + w.toString());
        System.out.println("\nWearable 2: " + w1.toString());
    }
    
}
