package com.dummyproject;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.opencsv.CSVReader;

public class OpenCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\USER\\IdeaProjects\\projectfellowship\\.gradle\\OpenCsvJson\\src\\test\\resources\\users.csv";

    public static void main(String[] args) throws IOException{
        try(
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null){
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email1 : " +nextRecord[1]);
                System.out.println("Phone : " +nextRecord[2]);
                System.out.println("Country : " +nextRecord[3]);
                System.out.println("======================");
            }
            List<String[]> records = csvReader.readAll();
            for(String[] record : records){
                System.out.println("Name : " + record[0]);
                System.out.println("Email :" +record[1]);
                System.out.println("Phone :" +record[2]);
                System.out.println("Country :" +record[3]);
                System.out.println("=============================");
            }
        }
    }
}
