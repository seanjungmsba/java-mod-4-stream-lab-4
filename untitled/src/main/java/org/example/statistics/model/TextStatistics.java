package org.example.statistics.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextStatistics {
    private int wordCount;
    private String mostCommonWord;
    private int longestWordLength;
    private double averageWordLength;

    public TextStatistics(int wordCount, String mostCommonWord, int longestWordLength, double averageWordLength) {
        this.wordCount = wordCount;
        this.mostCommonWord = mostCommonWord;
        this.longestWordLength = longestWordLength;
        this.averageWordLength = averageWordLength;
    }
    
}


