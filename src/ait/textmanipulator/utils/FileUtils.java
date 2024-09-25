package ait.textmanipulator.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<String> readLines(String inputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }

    public static void writeLines(List<String> lines, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
