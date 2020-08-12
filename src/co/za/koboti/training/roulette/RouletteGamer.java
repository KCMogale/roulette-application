package co.za.koboti.training.roulette;

import java.util.ArrayList;
import java.util.Random;

public class RouletteGamer {

    public static void main(String[] args) {
        playerDashboard();
        Player playerOne = new Player();
        ArrayList<String> playerArrayOne = playerOne.placeYourBet();
        int val = randomNumber();
        SpinResults spinnerOne = spinner(playerArrayOne, val);

        Player playerTwo = new Player();
        ArrayList<String> playerArrayTwo = playerTwo.placeYourBet();
        SpinResults spinnerTwo = spinner(playerArrayTwo, val);

        resultsHeader(val, spinnerOne, spinnerTwo);
    }

    private static SpinResults spinner(ArrayList<String> playerArray, int spinnedNumber) {
        SpinResults spinResults = new SpinResults();
        spinResults.setPlayerName(playerArray.get(0));
        spinResults.setBetValue(playerArray.get(1));
        double betOnAmount = Double.parseDouble(playerArray.get(2));

        if (spinnedNumber % 2 == 0 && playerArray.get(1).equals("EVEN")) {
            spinResults.setResults("WIN");
            spinResults.setWinnings(2 * betOnAmount);
        } else if (spinnedNumber % 2 != 0 && (playerArray.get(1).equals("ODD")))  {
            spinResults.setResults("WIN");
            spinResults.setWinnings(2 * betOnAmount);
        } else if (spinnedNumber >= 1 && spinnedNumber <= 36) {
            if (spinnedNumber == Integer.parseInt(playerArray.get(1))) {
                spinResults.setResults("WIN");
                spinResults.setWinnings(36 * betOnAmount);
            } else {
                spinResults.setResults("LOSE");
                spinResults.setWinnings(0.0);
            }
        } else {
            spinResults.setResults("LOSE");
            spinResults.setWinnings(0.0);
        }

        return spinResults;
    }


    private static int randomNumber() {
        Random random = new Random();
        int randNum;
        do {
            randNum = random.nextInt(36);
        } while (randNum == 0);
        return randNum;
    }

    private static void resultsHeader(int spinValue, SpinResults spinResultsOne, SpinResults spinResultsTwo) {
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Number : " + spinValue);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Player\t\t\t\tBet\t\t\t\tOutcome\t\t\t\tWinnings");
        System.out.println("----------------------------------------------------------------");
        printResultsPlayerOne(spinResultsOne);
        printResultsPlayerTwo(spinResultsTwo);
        System.out.println("----------------------------------------------------------------");
    }


    private static void playerDashboard() {
        System.out.println("Please enter the following details to place your bet: " +
                "PlayerName Number Amount, where \n" +
                "PlayerName == player's name \n" +
                "Number == is what they want to bet on (i.e. 1-36, EVEN or ODD) \n" +
                "Amount == how much they want to bet \n\n" +
                "Example: Barbara EVEN 4.0 or Barbara 4 2.0 \n");
    }

    private static void printResultsPlayerOne(SpinResults results) {
        System.out.println(results.getPlayerName() + "\t\t\t\t" +
                results.getBetValue()+ "\t\t\t\t" +
                results.getResults() + "\t\t\t\t" +
                results.getWinnings());
    }

    private static void printResultsPlayerTwo(SpinResults results) {
        System.out.println(results.getPlayerName() + "\t\t\t\t" +
                results.getBetValue()+ "\t\t\t\t" +
                results.getResults() + "\t\t\t\t" +
                results.getWinnings());
    }


}
