package org.generation.italy.courseExamples.Piadineria.piadineria.esercizi;

import java.util.Scanner;

public class Esercizio2 {

    //funzione che stampa tutti i numeri n di fibonacci in maniera iterativa

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero per conoscere la serie di Fibonacci");
        int num = scan.nextInt();
        int n = 0;
        int m = 1;
        int risultato = 0;
        int pos = 1;

        for (int g = 0; g < num; g++) {
            if (g == 0) {
                risultato = 1;

            }
            System.out.println("In posizione " + pos + " il numero di Fibonacci è " + risultato + " ");
            risultato = n + m;
            n = m;
            m = risultato;
            pos++;
        }

    }
}


