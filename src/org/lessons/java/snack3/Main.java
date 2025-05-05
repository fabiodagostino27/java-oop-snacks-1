package org.lessons.java.snack3;

import org.lessons.java.snack1.Studente;

public class Main {
    public static void main(String[] args) {
        Studente pinco = new Studente("Pinco", "Pallo", 22);

        System.out.println(pinco.getStudentInfo());
        System.out.println(RegistroStudenti.getRegistro());
    }
}
