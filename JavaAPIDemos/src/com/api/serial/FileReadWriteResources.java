package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWriteResources {
    public static void main(String[] args) {

        try( FileReader fileReader =  new FileReader("./demo.txt");
             FileWriter fileWriter = new FileWriter("./trial.txt");
            ) {
            int num = fileReader.read();
            fileWriter.write((char)num);
            do{
                num = fileReader.read();
                fileWriter.write((char)num);
            } while (num!=-1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Completed");
        }
    }
}
