package org.lessons.java.snack2;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContoBancario mioConto = new ContoBancario("GB33BUKB20201555555555");

        System.out.println(mioConto.getSaldo());
        mioConto.deposita(new BigDecimal("-10.30"));
        System.out.println(mioConto.getSaldo());
        mioConto.deposita(new BigDecimal("100.30"));
        System.out.println(mioConto.getSaldo());
        mioConto.preleva(new BigDecimal("100"));
        System.out.println(mioConto.getSaldo());
    }    
}
