package org.hangman_game;

public class Main {
//    public static String exit = "1";

    public static void main(String[] args) {
        System.out.println("Мы начинаем игру Hang_Man");
        System.out.println("Если вы хотите прекратить игру, напишите 'exit'");

        Game game = new Game();
        game.startGame();

        //todo в самом конце
//        while (!exit.equals("exit")) {
//            System.out.print("Пожалуйста введите команду: ");
//            Scanner scanner = new Scanner(System.in);
//            String command = scanner.next();
//            switch (command) {
//                case "exit" -> exit = command;
//                case "go" -> {
//                    System.out.println("Ваша игра запущена");
//                    Game game = new Game();
//                    game.startGame();
//                }
//            }
//        }
    }
}
