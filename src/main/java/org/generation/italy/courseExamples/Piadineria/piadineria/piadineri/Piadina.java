package org.generation.italy.courseExamples.Piadineria.piadineria.piadineri;

import java.time.LocalDate;

public class Piadina {   //abbiamo creato una classe e le sue variabili
    private String nameWrap;
    private String typeWrap;//attributi o variabili
    private int dimension;//attributi
    private boolean tomato ;//attributi
    private boolean chicken;//attributi
    private String addition;//attributi
    private String sauce;//attributi

    //Costruttore di default
    public Piadina(){


    }

//come sarà la struttura del mio costruttore
//un costruttore serve per creare e inizializzare i miei oggetti
    public Piadina(String nameWrap, String typeWrap, int dimension, boolean tomato, boolean chicken, String addition, String sauce){//metodi o funzioni della classe(costruttore)
        this.nameWrap = nameWrap;
        this.typeWrap = typeWrap;// nel caso in cui non ci fosse
        this.dimension = dimension;
        this.tomato = tomato;
        this.chicken = chicken;
        this.addition = addition;
        this.sauce = sauce;

    }
//serve per rendere un valore private in public
    public String getNameWrap(){return nameWrap;}
    public void setNameWrap(String nameWrap){this.nameWrap = nameWrap;}//(String nameWrap) parametro input del metodo
    public String getTypeWrap(){return typeWrap;}//questi sono i metodi
    public void setTypeWrap(String typewrap) {this.typeWrap = typewrap;}
    public int getDimension(){return dimension;}
    public void setDimension(int dimension) {this.dimension = dimension;}
    public boolean getTomato(){return tomato;}
    public void setTomato(boolean tomato){this.tomato = tomato;}//set: serve per dare valore all'attributo
//        if (tomato) {
//            System.out.println("non contiene pomodoro");
//        } else {
//            System.out.println("contiene pomodoro");
//        }

    public boolean getChicken(){return chicken;}//get: restituisce il valore dell'attributo a cui si riferisce
    // visibilità TipoDiRitorno  nomeMetodo(parametri)
    public void setChicken(boolean chicken) {this.chicken = chicken;}
    public String getAddition(){return addition;}
    public void setAddition(String addition) {this.addition = addition;}
    public String getSauce(){return sauce;}// funzionano per modificare dei valori che sono private,
                                           // quindi non si puo accedere da fuori alla main
    public void setSauce(String sauce) {this.sauce = sauce;}//funziona per modificare solamento il lavore
    // this: (indirizzo dell oggetto che sto costruendo) significa che prendiamo la variabile della classe Piadina e la riportiamo in questa classe


//    @Override ridefinisci un metodo ereditato da una classe madre.
//    public String toString() {
//        String info = "nome piadina" +this.getChicken()+"/n"+ "tipo di piadina"+ this.TypeWrap;
//        //return super.toString = ritorna il risultato di eseguire della classe madre
//        //return "ciao" + super.toString();
//    }
}



