package ait.textmanipulator.action;

import ait.textmanipulator.model.Action;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ReverseAction extends Action {

    @Override
    public void performAction(String inputFile, String outputFile) throws IOException {
        List<String> lines = readLines(inputFile);
        Collections.reverse(lines);
        writeLines(lines, outputFile);
    }
}
