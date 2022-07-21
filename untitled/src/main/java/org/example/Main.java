package org.example;

import org.example.io.StatisticsOutputService;
import org.example.io.TextInputService;
import org.example.io.impl.JsonFileStatisticsOutputService;
import org.example.io.impl.SampleFileTextInputService;
import org.example.statistics.TextStatisticsService;

public class Main {
    public static void main(String[] args) {

        // Prepare dependencies (wouldn't it be nice if we had a framework that could do this chore?)
        TextInputService textInputService = new SampleFileTextInputService();
        StatisticsOutputService statisticsOutputService = new JsonFileStatisticsOutputService();
        TextStatisticsService textStatisticsService = new TextStatisticsService();

        // Build up processor (since it requires dependencies) (wouldn't it be nice if we had a framework that could do this chore?)
        Processor processor = new Processor(textInputService, statisticsOutputService, textStatisticsService);

        // Run it!
        processor.process();
        
    }
}