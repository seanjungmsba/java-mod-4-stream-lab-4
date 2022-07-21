package org.example.io.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.example.io.TextInputService;

public class SampleFileTextInputService implements TextInputService {

    private static final String FILE_NAME = "C:\\Users\\seanj\\Documents\\GitHub\\Flatiron_Bootcamp_Summer_2022\\java-mod-4-stream-lab-4\\untitled\\book.txt";

    @Override
    public String getText() {
        try {
            Path path =  Path.of(FILE_NAME);
            String content = Files.readString(path);
            String cleanedContent = content.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().trim();
            return cleanedContent;

        } catch (IOException ioException) {
            System.err.println("Something went wrong"); 
        }
        return null;
    }

}