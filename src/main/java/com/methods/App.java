package com.methods;

public class App {
    public static void main(String[] args) {
        openCharacterHistory();
    }

    public static String displayCharacter(String username) {
        return username + " is being displayed.";
    }

    public static String getCharacterHighScores() {
        return "Highest Kills: 10000";
    }

    public static void openCharacterHistory() {
        System.out.println(displayCharacter("bobby"));
        System.out.println(getCharacterHighScores());
    }
}
