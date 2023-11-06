package test_arrays;

import domain.Persona;

public class TestArraysObject {

    public static void main(String[] args) {

    //Declaramos un array de Objetos tipo Persona
    Persona[] personas = new Persona[2];

    //Instanciamos dos clases Persona
    personas[0] = new Persona("Luis");
    personas[1] = new Persona("Cristina");

    System.out.println("personas[0].toString() = " + personas[0].toString());
    System.out.println("personas[1].toString() = " + personas[1].toString());

        for (Persona persona : personas) {
            System.out.println("persona.getName() = " + persona.getName());
        }

    }
}
