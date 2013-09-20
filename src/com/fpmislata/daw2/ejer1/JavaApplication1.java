/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.ejer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Persona> mapPersonas = new HashMap<String, Persona>();
        List<Persona> personas = new ArrayList<Persona>();//donde arraylist tambien vale ArrayList<>();
        personas.add(new Persona("00000000A", "PL", "Man", Sexo.HOMBRE));
        personas.add(new Persona("00001101A", "PM", "Man", Sexo.HOMBRE));
        personas.add(new Persona("12345678J", "PN", "Man", Sexo.HOMBRE));

        mapPersonas.put("00000000A", new Persona("00000000A", "PL", "Man", Sexo.HOMBRE));
        mapPersonas.put("00001101A", new Persona("00001101A", "PM", "Man", Sexo.HOMBRE));
        mapPersonas.put("12345678J", new Persona("12345678J", "PN", "Man", Sexo.HOMBRE));
        

//        for (Persona persona:personas){
//            if(persona.getDNI().equals("12345678J")){
//            System.out.println(persona.getNombreCompleto());
//            }
//        }
//        System.out.println("Nº de elementos: "+personas.size());




//            System.out.println(mapPersonas.get("12345678J").getNombreCompleto());
//            System.out.println("Nº de elementos: "+mapPersonas.size());

        
        
        //set<String> dnis=mapPeersonas.get("12345678J");
        
              for (String dni : mapPersonas.keySet()){
                  System.out.println(mapPersonas.get(dni).getNombreCompleto());
              }

//        Persona persona = new Persona("Paco","Man",Sexo.HOMBRE);
//        String nombre = persona.getNombreCompleto();             
//        System.out.println(nombre);


    }
}
