package org.example;

import org.example.io.StatisticsOutputService;
import org.example.io.TextInputService;
import org.example.statistics.TextStatisticsService;

public class Processor {
    private TextInputService textInputService;
    private StatisticsOutputService statisticsOutputService;
    private TextStatisticsService textStatisticsService;

    public Processor(TextInputService textInputService, StatisticsOutputService statisticsOutputService, TextStatisticsService textStatisticsService) {
        this.textInputService = textInputService;
        this.statisticsOutputService = statisticsOutputService;
        this.textStatisticsService = textStatisticsService;
    }

    /**
     * This should just read in text
     * Get the statistics
     * Output the statistics
     */
    public void process() {
        // TODO
        String text = textInputService.getText();
        statisticsOutputService.save(textStatisticsService.getStatistics(text)); 
        System.out.println("JSON file is processed in the directory!");
    }
    
}
