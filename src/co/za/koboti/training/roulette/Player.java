package co.za.koboti.training.roulette;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    public Player() {
    }

    public ArrayList<String> placeYourBet() {
        Scanner console = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int arrayLength = 3;
        System.out.print("Please place your bet in this format, playerName (p) number (n) bettingAmount (b) : ");
        for (int i = 0; i < arrayLength; i++) {
            String userInput = console.next();
            arrayList.add(userInput);
        }
        return arrayList;
    }

}
