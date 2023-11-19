package org.generation.italy.courseExamples.Piadineria.piadineria.piadineri;

import org.generation.italy.courseExamples.Piadineria.piadineria.piadineri.Piadina;

public class Piadineria {

    public static void main(String[] args){ //main si usa quando si vuole eseguire
        System.out.println("Benvenuti alla Wrapperia da Ap&Gigio");
        //Thread.sleep(3000);
        System.out.println("  ");
        System.out.println("Il nostro menù comprende 2 piadine" );
        System.out.println("  ");
        //Thread.sleep(3000);
// invoco la mia classe         invoco il costruttore
        Piadina cichkenPiadina = new Piadina("Piadina di AP" ,"Piadina di grano", 30, false, true, "cetrioli e cipolla", "Maionese");
        System.out.println("Il nome della prima piadina è " +cichkenPiadina.getNameWrap());
        System.out.println("La farina della piadine è " +cichkenPiadina.getTypeWrap());
        System.out.println("La dimensione della piadine è " +cichkenPiadina.getDimension()+ " cm");
        System.out.println("La piadina contiene pomodoro? " +cichkenPiadina.getTomato());
        System.out.println("LA piadina contiene pollo? " +cichkenPiadina.getChicken());
        System.out.println("La piadina ha dei contorni? " +cichkenPiadina.getAddition());
        System.out.println("La piadina quali salse ha ? " +cichkenPiadina.getSauce());

        System.out.println("  ");

        Piadina MelenzanaPiadina = new Piadina("Piadina di Gi" ,"Piadina di mais", 55 , true, true, "melenzane e peperoni", "Maionese e salsa barbecue");
        System.out.println("Il nome della seconda piadina è " +MelenzanaPiadina.getNameWrap());
        System.out.println("La farina della piadine è " + MelenzanaPiadina.getTypeWrap());
        System.out.println("La dimensione della piadine è " +MelenzanaPiadina.getDimension()+ " cm");
        System.out.println("La piadina contiene pomodoro? " +MelenzanaPiadina.getTomato());
        System.out.println("LA piadina contiene pollo? " +MelenzanaPiadina.getChicken());
        System.out.println("La piadina ha dei contorni? " +MelenzanaPiadina.getAddition());
        System.out.println("La piadina quali salse ha ? " +MelenzanaPiadina.getSauce());
    }

}
