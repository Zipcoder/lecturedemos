package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 11/18/21 2:11 PM
 */ // this class is too advanced for me to test with my current knowledge
public class NumberGuessGameEngine {
    private NumberGuessGame game;
    private List<NumberGuessPlayer> playerList;

    // why did we make this, when we'll just use the default engine constructor anyway??
    public NumberGuessGameEngine(NumberGuessGame game, List<NumberGuessPlayer> playerList) {
        this.game = game;
        this.playerList = playerList;
    }

    public NumberGuessGameEngine() {
        this(new NumberGuessGame(), new ArrayList<>());
    }

    public void run() {
        IOConsole console = new IOConsole();
        for(NumberGuessPlayer player : playerList) {
            console.println("Enter your decision");
            String decision = console.getStringInput("[A], [B], [C]");
            game.evaluateDecision(decision, player);
        }
    }
}
