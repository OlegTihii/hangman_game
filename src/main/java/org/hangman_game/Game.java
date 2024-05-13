package org.hangman_game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Game {
    private static final Path path = Paths.get("src/main/java/resources/test.txt");
    private String word;

    public void startGame() {
        //загружаем слово из списка слов
        word = someWord();
    }

    private String someWord() {
        List<String> stringsList = textFileToList();
        return chooseRandomWord(stringsList);
    }

    private String chooseRandomWord(List<String> strings) {
        Random random = new Random();
        return strings.get(random.nextInt(strings.size()));
    }

    private List<String> textFileToList() {
        try {
            return Files.readAllLines(path)
                    .stream()
                    .map(String::strip)
                    .filter(s -> !s.isBlank())
                    .filter(s -> !s.contains(" "))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
