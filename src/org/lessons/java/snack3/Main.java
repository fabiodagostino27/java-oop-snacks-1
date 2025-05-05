package org.lessons.java.snack3;

import org.lessons.java.snack1.Studente;

public class Main {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();
        Studente pinco = new Studente("Pinco", "Pallo", 22);

        registro.addStudente(pinco);
    }
}
