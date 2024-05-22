package org.hangman_game;

import java.util.Scanner;
public class Game {
    Word word = Word.getInstance();
    View view = word.getView();

    public void startGame() {
        System.out.println("Приветствие в игре и информация");
        while (true) {
            inputWord();
            System.out.println(view.countAttempts);
            if(view.countAttempts == 0){
                System.out.println("ПОПЫТКИ ЗАКОНЧИЛИСЬ");
                break;
            }
            if (checkGameStatus()) {
                System.out.println("ТЫ ПОБЕДИЛ БРАТУХА");
                break;
            }
        }
    }

    public void inputWord() {
        System.out.print("Пожалуйста введите букву: ");
        Scanner scanner = new Scanner(System.in);
        word.comparableLetter(scanner.next().charAt(0));
    }

    private boolean checkGameStatus() {
        return word.getStatus();
    }
}
