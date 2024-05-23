package org.lessons.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Wishlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> gifts = new ArrayList<>();
        boolean keepRunning = true;

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("What do you want for Christmas?");
        //     String gift = scanner.nextLine();
        //     gifts.add(new Gift(gift));
        // } System.out.println("This year for Christmas you want:");
        // System.out.println(gifts);

        while(keepRunning){
            System.out.println("Wanna add something to your wishlist?");
            System.out.print("Answer with (y)es or (n)o: ");
            String yesOrNo = scanner.nextLine().toLowerCase();
            if(yesOrNo.equals("y")){
                System.out.println("What do you want for Christmas?");
                String gift = scanner.nextLine();
                gifts.add(gift);  
            } else {
                keepRunning = false;
            }
        }

        if(gifts.isEmpty()){
            System.out.println("You sure you don't want anything for Christmas?");
        } else {
            System.out.println("This year for Christmas you want:");
            Collections.sort(gifts);
            System.out.println(gifts);
        }
    }
}