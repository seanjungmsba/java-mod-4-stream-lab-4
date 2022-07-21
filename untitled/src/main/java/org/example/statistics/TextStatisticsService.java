package org.example.statistics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.example.statistics.model.TextStatistics;

public class TextStatisticsService {
    
    public TextStatistics getStatistics(String text) {

        List<String> data = Arrays.asList(text.split("\\s+"));

        int word_count = wordCount(data);
        String most_common_word = mostCommonWord(data);
        int longest_word_length = longestWordLength(data);
        double average_word_length = averageWordLength(data);       

        TextStatistics textStatistics = new TextStatistics(word_count, most_common_word, longest_word_length, average_word_length);
        return textStatistics;
        
    }

    public Integer wordCount(List<String> data) {
        // List<Integer> wordList = data.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        return (int)data.stream().count();
    }

    public String mostCommonWord(List<String> data) {
        Map<String, Integer> frequencyMap = data.stream() 
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(val -> 1)));
        String mostcommonword = Collections.max(frequencyMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        return mostcommonword; 
    }

    public Integer longestWordLength(List<String> data) {
        Integer longestwordlength = data.stream() 
                     .mapToInt(word -> word.length()) 
                     .max() 
                     .orElse(0); 
        return longestwordlength; 
    }

    public Double averageWordLength(List<String> data) {
        Double averagewordlength = data.stream() 
                     .mapToInt(word -> word.length()) 
                     .average() 
                     .orElse(0); 
        return averagewordlength; 
    }

}