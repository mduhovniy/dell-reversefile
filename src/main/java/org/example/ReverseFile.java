package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFile {

    private int index = 0;
    private String row;
    private final BufferedReader fileHandler;

    public ReverseFile(String fileName) throws FileNotFoundException {
        this.fileHandler = new BufferedReader(new FileReader(fileName));
    }

    public String readLine() throws IOException {
        if (row == null) {
            return readAndReverse();
        }
        String output = row.substring(index);
        row = null;
        index = 0;
        return output;
    }

    public String read(int numOfChars) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (row == null || row.isEmpty()) {
            row = readAndReverse();
        }

        if (row.length() -1 > numOfChars + index) {
            sb.append(row, index, index + numOfChars);
            index += numOfChars;
        } else {
            String segment = "";
            while (numOfChars > 0) {
                segment = row.substring(index);
                numOfChars -= segment.length();
                sb.append(segment);
            }
            // TODO: fix the logic in loop!!!
            index = segment.length();
        }
        return sb.toString();
    }

    private String readAndReverse() throws IOException {
        StringBuilder sb = new StringBuilder();
        String[] splittedRow = fileHandler.readLine().split(" ");
        int i = splittedRow.length - 1;
        while (i >= 0) {
            sb.append(splittedRow[i--]).append(" ");
        }
        return sb.toString().trim();
    }
}
