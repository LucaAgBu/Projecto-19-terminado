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
public abstract class Electrodomestico {
    
    private int precio;
    private String color;
    private String consumo;
    private int peso;

    public Electrodomestico(int precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String comprobarColor(String color){
        
        if (color.equalsIgnoreCase("blanco") || 
                color.equalsIgnoreCase("negro") || 
                color.equalsIgnoreCase("rojo") ||
                color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris")){
                return color;
        }
        else{
            return "blanco";
        }
        
    }
    
    public String comprobarConsumo(String letra){
        if (letra.equalsIgnoreCase("a") || 
                letra.equalsIgnoreCase("b") || 
                letra.equalsIgnoreCase("c") || 
                letra.equalsIgnoreCase("d") || 
                letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("f")){
            return letra;
        }
        else{
            return "F";
        }
    }
    
    public void crearElectrodomestico(String color, String consumo, int peso){
        
        setPeso(peso);
        setPrecio(1000);
        setColor(comprobarColor(color));
        setConsumo(comprobarConsumo(consumo));
        
    }
    public  void precioFinal(){
        switch (consumo) {
            case "a":
                precio=precio+1000;
                break;
            case "b":
                precio=precio+800;
                break;
            case "c":
                precio=precio+600;
                break;
            case "d":
                precio=precio+500;
                break;
            case "e":
                precio=precio+300;
                break;
            case "f":
                precio=precio+100;
                break;
            default:
                throw new AssertionError();
        }
        
        if (peso>=1 && peso<=19) {
            precio=precio+100;
        }else if(peso>=20 && peso<=49){
            precio = precio +500;
        }
        else if(peso>=50 && peso <=79){
            precio = precio + 800;
        }
        else if(peso>=80){
            precio = precio + 1000;
        }
        

    }
}