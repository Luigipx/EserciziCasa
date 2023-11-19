package org.generation.italy.courseExamples.Piadineria.piadineria.esercizi;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        //calcolare il fattoriale di un numero in maniera itertiva e ricorsiva

        int n = userInput();
        //System.out.println("il valore fattoriale del nunero " + n + " è = " + calcoloFattoriale(n));
        if (calcoloFattorialeIterativo(n) == -1){
            System.out.println("il numero deve essere maggiore o uguale a 0");
        }else {
            System.out.println("il valore fattoriale del nunero " + n + " è = " + calcoloFattorialeIterativo(n));
        }

        System.out.println("il valore fattoriale del nunero " + n + " è = " + calcoloFattorialeRicorsivo(n));
    }


    public static int userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero positivo per calcolare il fattoriale ");
        return scan.nextInt();

    }

    public static long calcoloFattorialeIterativo(int n) {
        long fattoriale = 1;

        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            fattoriale *= i;
        }
        return fattoriale;
    }

    public static long calcoloFattorialeRicorsivo(int n){
        if (n <= 1){
            return 1;
        }
        //return n * calcoloFattorialeRicorsivo(n - 1);
        return n * calcoloFattorialeRicorsivo(n - 1);

    }

}
