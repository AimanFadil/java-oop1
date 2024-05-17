package org.excercise.javadue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del proprietario: ");
        String nomeProprietario = scanner.nextLine();

        Conto prop1 = new Conto();
        prop1.setNomeProprietario(nomeProprietario);

        System.out.println("Nome del proprietario del conto: " + prop1.getNomeProprietario());
        System.out.println("Numero conto: " +prop1.getNumConto());
        System.out.println("Saldo: " +prop1.getSaldo() + "$");




        boolean prosegui = true;

        while (prosegui){
            System.out.println("Scegli una una di queste opzioni: ");
            System.out.println("Premi 1 (Versa soldi sul conto): ");
            System.out.println("Premi 2 (Preleva soldi dal conto): ");
            System.out.println("Premi 3 (ESCI): ");

            int sceltaUtente = scanner.nextInt();


            if( sceltaUtente == 1 ){
                System.out.print("Inserisci l'importo da versare: ");
                double sommaDaVersare = scanner.nextDouble();
                prop1.versa(sommaDaVersare);

                System.out.println("Saldo: " +prop1.getSaldo() + "$");
            } else if (sceltaUtente == 2) {
                System.out.print("Inserisci l'importo da prelevare: ");
                double sommaDaPrelevare = scanner.nextDouble();
                prop1.preleva(sommaDaPrelevare);

                System.out.println("Saldo: " +prop1.getSaldo() + "$");
            } else if (sceltaUtente == 3){
                prosegui = false;
            }

        }





    }
}
