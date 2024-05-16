package org.hangman_game;

public class Game {
    Word word = Word.getInstance();

    public void startGame() {
       word.comparableLetter('а');
    }
}
