package org.excercise.java;

import java.util.Random;

public class JavaShop {

    //ATTRIBUTI


    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private int iva;

    //COSTRUTTORI

    public JavaShop( String nome,String descrizione, double prezzo){
        this.codice = getRandomCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = getPrezzoIva();
    }



    //METODI

    String getCodiceStringa(){

        String numeroStringa = Integer.toString(codice);
        String addZero = "0000" + numeroStringa;
        return addZero;
    }

    int getPrezzoIva(){
        double aggiunta = prezzo * 0.22;
        return (int) (prezzo + aggiunta);
    }

    int getRandomCodice(){
        Random random = new Random();
        int rand = random.nextInt(10000);
        return rand;
    }


    //GETTER
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }


    //SETTER

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

   }

