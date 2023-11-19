package org.generation.italy.courseExamples.Piadineria.piadineria.esercizi;

import java.util.Scanner;

public class Esercizio3 {
    // dici se il numero n è primo
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Inserisci un numero e ti dirò se è un numero primo");
        double n = num.nextInt();

        int counter = 0;

        for (int c = 0; c <= n; c++) {
            if (n % c == 0) {
                counter++;
            }

        } if(counter ==1) {
            System.out.println("il numero " + n + " non è primo perchè è divisibile solo per " + counter + " numero.");
        } else if(counter <=2) {
            System.out.println("il numero " + n + " è primo perché è divisibile solo per " + counter + " numeri.");
        }else {
            System.out.println("il numero " + n + " non è primo perché è divisibile per " + counter + " numeri.");
        }

    }
}




