package org.hangman_game;

public class View {
    int countAttempts = 6;

    public void wordView(char[] arrWord) {
        System.out.println(arrWord);
    }

    public void countingAttempts() {
        countAttempts--;
        countAttemptsView(countAttempts);
    }

    private void countAttemptsView(int attempts) {
        switch (attempts) {
            case 6 -> System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            case 5 -> System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            case 4 -> System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            case 3 -> System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========");
            case 2 -> System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "========");
            case 1 -> System.out.println(" +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========");
            case 0 -> System.out.println("+---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========");

            default -> System.out.println("Что то пошло не так");
        }
    }
}
