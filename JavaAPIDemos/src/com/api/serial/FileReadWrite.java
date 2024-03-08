package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("./trial.txt");
            fileReader = new FileReader("./demo.txt");
            int num = fileReader.read();
            fileWriter.write((char)num);
            do{
                num = fileReader.read();
                fileWriter.write((char)num);
            } while (num!=-1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
            if(fileReader!=null) fileReader.close();
            if(fileWriter!=null) fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
