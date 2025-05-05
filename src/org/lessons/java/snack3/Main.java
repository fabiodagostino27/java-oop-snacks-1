package org.lessons.java.snack3;

import org.lessons.java.snack1.Studente;

public class Main {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();
        Studente pinco = new Studente("Pinco", "Pallo", 22);
        Studente mario = new Studente("Mario", "Rossi", 21);
        Studente paolo = new Studente("Paolo", "Limiti", 23);

        registro.addStudente(pinco.getStudentInfo());
        registro.addStudente(mario.getStudentInfo());
        registro.addStudente(paolo.getStudentInfo());
        registro.getRegistro();
    }
}
