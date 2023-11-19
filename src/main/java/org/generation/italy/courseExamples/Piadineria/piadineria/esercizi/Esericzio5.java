package org.generation.italy.courseExamples.Piadineria.piadineria.esercizi;

import java.util.Scanner;

public class Esericzio5 {

    public static void main(String[] args) {
        int n = userInput();
        print(primeArray(n));
    }
    public static int userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero per conoscere tutti i numeri primi da 0 al tuo numero ");
        return scan.nextInt();

    }
    public static int[] primeArray(int n) {
        int[] numsP = new int[n];
        int counter = 0;
        int[] nums = null;
        for(int i = 1; i <= n; i++) {
            if(numPrime(i)) {
                counter++;
            }
        }
        System.out.println("Abbiamo trovato " +counter+  " numeri primi, i numeri primi da 0 a " +n+ " sono : ");

        nums = new int[counter];
        int g = 0;
        for(int k = 1; k <= n; k++) {
            if(numPrime(k)) {
                nums[g] = k;
                g++;
                continue;
            }
        }
        return nums;
    }
    public static void print(int[] array) {
        int newLine = 0;
        for (int j : array) {
            System.out.print(j + " ");
            newLine++;
        }
    }
    public static boolean numPrime(int n) {
        if(n == 1) {
            return false;
        }
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        return count <= 2;
    }
}
