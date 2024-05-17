package org.excercise.java;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        JavaShop prod2 = new JavaShop( "Giacca", "Giacca pelle", 12.90);
        JavaShop prod3 = new JavaShop( "Pantalone", "Pantalone seta", 8.10);
        JavaShop prod4 = new JavaShop( "Jeans", "Jeans Levis", 24.90);
        JavaShop prod5 = new JavaShop( "Cappello", "Cappello NY", 19.90);
        JavaShop prod6 = new JavaShop( "Scarpa", "Scarpa Nike", 30.00);
        JavaShop prod7 = new JavaShop( "Camicia", "Camicia coreana", 11.90);


        System.out.println("Codice prodotto: " + prod2.getCodiceStringa());
        System.out.println("Prezzo prodotto: " +prod2.getPrezzo() + "$");
        System.out.println("Prezzo con iva prodotto: " +prod2.getPrezzoIva() + "$");
        System.out.println("Nome esteso: " + prod2.getCodice() + "-" +prod2.getNome() );









    }
}
