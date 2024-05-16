package org.hangman_game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Word {
    private static final Path path = Paths.get("src/main/java/resources/test.txt");
    private final View view = new View();
    private static Word instance;
    private String word;
    private char[] arrWord;

    private Word() {
        setWord();
        createGameTerminalWord();
        showTerminalWord();
    }

    public void createGameTerminalWord() {
        int i = 0;
        arrWord = new char[word.length()];
        while (i < word.length()) {
            arrWord[i] = '_';
            i++;
        }
    }

    public void comparableLetter(char inputLetter) {
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == inputLetter) {
                arrWord[i] = inputLetter;
                flag = true;
            }
        }
        if (!flag) {
            attempts();
            showTerminalWord();
        } else {
            showTerminalWord();
        }
    }


    private void attempts() {
        int count = 0;

    }

    private void setWord() {
        List<String> stringsList = textFileToList();
        this.word = chooseRandomWord(stringsList);
    }

    private List<String> textFileToList() {
        try {
            return Files.readAllLines(Word.path)
                    .stream()
                    .map(String::strip)
                    .filter(s -> !s.isBlank())
                    .filter(s -> !s.contains(" "))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String chooseRandomWord(List<String> strings) {
        Random random = new Random();
        return strings.get(random.nextInt(strings.size()));
    }

    public static Word getInstance() {
        if (instance == null) {
            instance = new Word();
        }
        return instance;
    }

    private void showTerminalWord() {
        view.wordView(arrWord);
    }
}
