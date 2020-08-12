package co.za.koboti.training.roulette;

public class SpinResults {

    private String results;
    private double winnings;
    private String playerName;
    private String betValue;

    public SpinResults() {
    }

    public SpinResults(String results, double winnings, String playerName, String betValue) {
        this.results = results;
        this.winnings = winnings;
        this.playerName = playerName;
        this.betValue = betValue;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public double getWinnings() {
        return winnings;
    }

    public void setWinnings(double winnings) {
        this.winnings = winnings;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getBetValue() {
        return betValue;
    }

    public void setBetValue(String betValue) {
        this.betValue = betValue;
    }
}


