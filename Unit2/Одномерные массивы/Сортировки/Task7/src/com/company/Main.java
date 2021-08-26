package com.company;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {

            int N1 = 10;
            int[] Array = new int[N1];
            for (int i = 0; i < N1; i++) {
                Array[i] = (rand.nextInt(10));
            }
        Array = sort(Array, N1);

            int N2 = 10;
            int[] Array1 = new int[N2];
            for (int i = 0; i < N2; i++) {
                Array1[i] = (int) (rand.nextInt(10));
            }
        Array1 = sort(Array1, N2);

            ArrayList<Integer> place = new ArrayList<>();

            for (int i = 1; i < N1; i++) {

                if (Array[0] >= Array1[i - 1]) {
                    place.add(0);

                }

                for (int j = 0; j < N2; j++) {


                    if (Array[i - 1] < Array1[j] && Array[i] >= Array1[j]) {
                        place.add(i);

                    } else if (Array[Array.length - 1] < Array1[j] && Array[Array.length - 1] == Array[i]) {
                        place.add(i + 1);

                    }
                }
            }

            System.out.println();
            for (int i = 0; i < N1; i++)
                System.out.print(Array[i] + " ");
            System.out.println();
            for (int i = 0; i < N2; i++)
                System.out.print(Array1[i] + " ");
            System.out.println();
            System.out.println(place);

            System.out.println();
        }

    public static int[] sort(int[] Array, int N) {
        int buf;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (Array[j - 1] > Array[j]) {
                    buf = Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = buf;
                }
            }
        }

        return Array;
    }
}
