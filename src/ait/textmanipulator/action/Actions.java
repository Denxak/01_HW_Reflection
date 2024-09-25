//  Additional Requirements for Developers Adding Their Own Actions:
//      1. All action methods must be named using lowercase (e.g., sort, reverse, shuffle)
//      2. Each method must accept two arguments:
//          - String inputFile: the name of the input text file.
//          - String outputFile: the name of the output text file.
//      3. All new actions should be implemented in the Actions class.
//      4. All actions should handle I/O-related exceptions sing Existing Methods:
//      5. Developers are encouraged to use the provided `readLines` and `writeLines` methods
/*
// Example of a new action structure:
public void myNewAction(String inputFile, String outputFile) throws IOException {
    List<String> lines = readLines(inputFile);
    // Performing necessary manipulations with lines
    writeLines(lines, outputFile);
}
*/
package ait.textmanipulator.action;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static ait.textmanipulator.utils.FileUtils.readLines;
import static ait.textmanipulator.utils.FileUtils.writeLines;

public class Actions {
    public void sort(String inputFile, String outputFile) throws IOException {
        List<String> lines = readLines(inputFile);
        lines.sort(String::compareTo);
        writeLines(lines, outputFile);
    }

    public void reverse(String inputFile, String outputFile) throws IOException {
        List<String> lines = readLines(inputFile);
        Collections.reverse(lines);
        writeLines(lines, outputFile);
    }

    public void shuffle(String inputFile, String outputFile) throws IOException {
        List<String> lines = readLines(inputFile);
        Collections.shuffle(lines);
        writeLines(lines, outputFile);
    }
}
