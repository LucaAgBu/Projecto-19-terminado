/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pc-Casa
 */
public class JavaApplication18 {

    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electros = new ArrayList();
        
        electros.add(new Televisor());
        ((Televisor) electros.get(0)).crearTelevisor(42, true, "rojo", "b", 45);
        electros.add(new Televisor());
        ((Televisor) electros.get(1)).crearTelevisor(35, false, "negro", "a", 32);
        
        electros.add(new Lavadora());
        ((Lavadora) electros.get(2)).crearLavadora(36, "negro", "a", 82);
        electros.add(new Lavadora());
        ((Lavadora) electros.get(3)).crearLavadora(25, "blanco", "d", 42);
        
        int suma= 0;
        
        for (int i = 0; i < 4; i++) {
          
            
            electros.get(i).precioFinal();
            suma=electros.get(i).getPrecio()+suma;

        }
        
        for (int i = 0; i < electros.size(); i++) {
            
            System.out.println("electrodomestico nro "+i+" precio final "+electros.get(i).getPrecio());
            
        }
        
        System.out.println("suma del precio de todos los objetos "+ suma );
    }
    
}
