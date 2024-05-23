package org.lessons.java;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Wishlist {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("wishlist.txt", true);
        List<String> gifts = new ArrayList<>();
        boolean keepRunning = true;

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

        // writer.write("This year for Christmas you want: \n");

        if(gifts.isEmpty()){
            System.out.println("You sure you don't want anything for Christmas?");
        } else {
            Collections.sort(gifts);

            for (int i = 0; i < gifts.size(); i++) {
                writer.write(gifts.get(i).toString() + "\n");
            }
        }
        scanner.close();
        writer.close();
    }
}