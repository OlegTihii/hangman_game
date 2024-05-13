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

    String word = someWord();

    public int comparableLetter(char letterInput, String word){
       return word.indexOf(letterInput);
    }

    private String someWord() {
        List<String> stringsList = textFileToList();
        return chooseRandomWord(stringsList);
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

    public String getWord() {
        return word;
    }
}
