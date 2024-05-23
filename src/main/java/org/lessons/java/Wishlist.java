package org.lessons.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wishlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Gift> gifts = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("What do you want for Christmas?");
            String gift = scanner.nextLine();
            gifts.add(new Gift(gift));
        } System.out.println("This year for Christmas you want:");
        System.out.println(gifts);
    }
}