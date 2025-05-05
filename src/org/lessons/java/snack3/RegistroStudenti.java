package org.lessons.java.snack3;

import java.util.ArrayList;

import org.lessons.java.snack1.Studente;

public class RegistroStudenti {
    // Snack 3: Registro Studenti
    // Crea una classe RegistroStudenti che rappresenti un registro di studenti.
    // Utilizza un array privato per memorizzare oggetti Studente (creati nello
    // Snack 1). Implementa un costruttore senza parametri per inizializzare il
    // registro vuoto e un metodo pubblico per aggiungere studenti al registro.
    // Aggiungi un metodo che stampi la lista degli studenti.

    private static ArrayList<Studente> registro;

    public RegistroStudenti() {
        registro = new ArrayList<Studente>();
    }

    public void addStudente(Studente studente) {
        registro.add(studente);
    }

    public ArrayList<Studente> getRegistro() {
        return registro;
    }
}
