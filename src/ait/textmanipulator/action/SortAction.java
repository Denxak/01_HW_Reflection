package ait.textmanipulator.action;

import ait.textmanipulator.model.Action;

import java.io.IOException;
import java.util.List;

public class SortAction extends Action {

    @Override
    public void performAction(String inputFile, String outputFile) throws IOException {
        List<String> lines = readLines(inputFile);
        lines.sort(String::compareTo);
        writeLines(lines, outputFile);
    }
}
