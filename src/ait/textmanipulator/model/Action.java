package ait.textmanipulator.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Action {
    public abstract void performAction(String inputFile, String outputFile) throws IOException;

    protected List<String> readLines(String inputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }

    protected void writeLines(List<String> lines, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
