package com.quiz3.Queues;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random x = new Random();
        int count = 0;

        ArrayQueue queue = new ArrayQueue(100);

        for (int i = 0; i < 100; ++i) {
            int level;
            level = x.nextInt(100);
            queue.add(new Player(i + 1, "Player " + (i + 1), level));

        }

        //queue.printQueue();
        for (int i = 1; i < 11; ++i) {
            int j;
            while (queue.size() <7) {
                j = x.nextInt(6 + 1);
                System.out.println("Output test " + j);
                System.out.println("Press Any Key To Continue...");
                (new Scanner(System.in)).nextLine();
            }

            // Removal of the first 5 players

                for (j = 0; j < 5; j++) {
                    System.out.println("Players Removed " + queue.remove());
            }

            System.out.println("Game has Queued");

            System.out.println("After \n");

            queue.printQueue();

            System.out.println("Game No. " + i);

            System.out.println("Press Any Key To Continue...");
            (new Scanner(System.in)).nextLine();

        }
        System.out.println("GAME OVER");

    }
}