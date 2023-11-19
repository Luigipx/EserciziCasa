package org.generation.italy.courseExamples.Piadineria.piadineria.esercizi;

public class Esercizio4 {
    //Ricerca binaria

    public static void main(String[] args) {


        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int min = nums[0];
        int max = nums[nums.length-1];
        int target = 30;
        boolean search = false;

        while (!search && min <= max) {
            int med = (min + max) / 2;

            if (target == med) {
                System.out.println("il valore " + target + " è presente nell Array num");
                search = true;
            } else if (target > med) {
                min = med + 1;
            } else if (target < med) {
                max = med - 1;
            }
        }
        if (search == false) {
            System.out.println("il valore " + target + " non è presente nell Array num");
        }
    }
}