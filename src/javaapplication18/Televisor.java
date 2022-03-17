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
public class Televisor extends Electrodomestico{
    
    public int pulgadas;
    public boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(int pulgadas, boolean sintonizador, String color, String consumo, int peso){
        
        setPulgadas(pulgadas);
        setSintonizador(sintonizador);
        crearElectrodomestico(color, consumo, peso);
        
    }
    

    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(sintonizador){
            setPrecio(getPrecio()+500);
        }
        
        if (pulgadas>40){
            setPrecio((int) (getPrecio()+(getPrecio()*0.3)));
        }
        
    }
    
    
    
    
}
