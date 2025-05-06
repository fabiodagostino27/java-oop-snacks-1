package org.lessons.java.snack3;


public class RegistroStudenti {
    // Snack 3: Registro Studenti
    // Crea una classe RegistroStudenti che rappresenti un registro di studenti.
    // Utilizza un array privato per memorizzare oggetti Studente (creati nello
    // Snack 1). Implementa un costruttore senza parametri per inizializzare il
    // registro vuoto e un metodo pubblico per aggiungere studenti al registro.
    // Aggiungi un metodo che stampi la lista degli studenti.

    private String[] registro;

    public RegistroStudenti() {
        this.registro = new String[0];
    }

    public void addStudente(String studente) {
        String[] registroAggiornato = new String[this.registro.length + 1]; 

        for (int i = 0; i < this.registro.length; i++) {
            registroAggiornato[i] = this.registro[i];
        }

        registroAggiornato[registroAggiornato.length - 1] = studente;

        this.registro = registroAggiornato;
    }

    public void getRegistro() {
        for (int i = 0; i < registro.length; i++) {
            System.out.println(registro[i]);
        }
    }
}
