package org.excercise.javadue;

import java.util.Random;

public class Conto {
    //ATTRIBUTI

    private int numeroConto;
    private String nomeProprietario;
    private double saldo;


    //COSTRUTTORI

    public Conto ( ){
        this.numeroConto = getNumConto();
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;

    }


    //METODI

    int getNumConto(){
        Random random = new Random();
        int rand = random.nextInt(1000000);
        return rand;
    }

    //GETTER

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTER


    public void setNomeProprietario(String nomePropietario) {
        this.nomeProprietario = nomePropietario;
    }

    public void versa(double somma) {
        if (somma > 0) {
            saldo += somma;
            System.out.println("Versamento effettuato con successo");
        } else {
            System.out.println("Error 404");
        }
    }

    public void preleva(double somma) {
        if (somma > 0 && saldo >= somma) {
            saldo -= somma;
            System.out.println("Prelievo effettuato");
        } else {
            System.out.println("Error 404");
        }
    }
}
