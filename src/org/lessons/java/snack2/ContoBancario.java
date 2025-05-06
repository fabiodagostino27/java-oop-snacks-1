package org.lessons.java.snack2;

import java.math.BigDecimal;

public class ContoBancario {
    // Snack 2: Gestione di un Conto
    // Crea una classe ContoBancario con attributi per numero di conto e saldo.
    // Implementa un costruttore che accetta il numero di conto e inizializza il
    // saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto,
    // prelevare denaro dal conto e ottenere il saldo corrente.

    private String numeroConto;
    private static BigDecimal saldo = new BigDecimal("0");

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void deposita(BigDecimal deposito) {
        if (deposito.compareTo(new BigDecimal(0)) == 1) {
            saldo = saldo.add(deposito);
        }
    }

    public void preleva(BigDecimal prelievo) {
        if (saldo.compareTo(prelievo) == 1 || saldo.compareTo(prelievo) == 0) {
            saldo = saldo.subtract(prelievo);
        } else {
            System.out.println("Saldo insufficiente!");
        }
    }
}
