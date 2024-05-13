package org.hangman_game;

public class View {
    public StringBuilder wordInTerminal = new StringBuilder();
    Word word = new Word();

    public View() {
        gameTerminalWord(word.getWord());
    }

    public void gameTerminalWord(String word) {
        int i = 0;
        while (i < word.length()) {
            wordInTerminal.append("_");
            i++;
        }
    }

    public void addLetter(int index, char letter) {
        if (index != -1) {
            wordInTerminal.insert(index, letter);
        } else {
            System.out.println("НЕУГАДАЛ");
        }

    }

    public void wordView() {
        System.out.println(wordInTerminal);
    }
}
