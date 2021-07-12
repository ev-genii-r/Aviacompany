package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static String readFile(String fileName) throws IOException {
        String filePath = fileName;
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        String outputString = "";
        while(reader.ready()){
            outputString += reader.readLine() + '$';
        }
        return outputString;
    }
}
