package org.lessons.java.snack3;

import java.util.ArrayList;

public class RegistroStudenti {
    // Snack 3: Registro Studenti
    // Crea una classe RegistroStudenti che rappresenti un registro di studenti.
    // Utilizza un array privato per memorizzare oggetti Studente (creati nello
    // Snack 1). Implementa un costruttore senza parametri per inizializzare il
    // registro vuoto e un metodo pubblico per aggiungere studenti al registro.
    // Aggiungi un metodo che stampi la lista degli studenti.

    private static ArrayList<String> registro;

    public RegistroStudenti() {
        this.registro = new ArrayList<String>();
    }

    public static ArrayList<String> getRegistro() {
        return registro;
    }
}
