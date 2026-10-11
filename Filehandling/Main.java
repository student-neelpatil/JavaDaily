package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void filewriter(String filename){
        try {
            FileWriter output=new FileWriter(filename);
            output.write("hello Java");
            output.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void filereader(String filename){
     
        try {
            FileReader reader=new FileReader(filename);
            int data;
            while((data=reader.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }


    }

    public static void bufferdfilereader(String filename){
     
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            int data;
            while((data=reader.read())!=-1){
                System.out.print((char)data);
            }
            System.out.println();
            reader.close();
        } catch (Exception e) {
            e.getMessage();
        }


    }
    public static void main(String[] args) {
        String Filename="file2.txt";
        filewriter(Filename);
        filereader(Filename);
        bufferdfilereader(Filename);
    }
}
