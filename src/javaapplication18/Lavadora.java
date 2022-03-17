/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Pc-Casa
 */
public class Lavadora extends Electrodomestico{
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(int carga, String color, String consumo, int peso){
        crearElectrodomestico(color, consumo, peso);
        setCarga(carga);
    }
    
    @Override
    public void precioFinal(){

        super.precioFinal();
        
        if (carga>30){
            setPrecio(getPrecio()+500);
        }
        
        
        
    }
    
}
