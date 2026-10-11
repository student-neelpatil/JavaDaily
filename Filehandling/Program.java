package Filehandling;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
   
    public static void writetofile(String Filename)throws FileNotFoundException {
            try {
            FileOutputStream output =new FileOutputStream(Filename);


           String message="Hello";
           byte[] data=message.getBytes();
           output.write(data);
           output.close();
            
        
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }

        
    }

    public static void bufferwritetofile(String Filename)throws FileNotFoundException {
            try {
                BufferedOutputStream bf=new BufferedOutputStream(new FileOutputStream(Filename));


                  String message="I am working ";
                  byte[] data=message.getBytes();
                  bf.write(data);
                  bf.close();
            
        
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }

        
    }


  
    public static void bufferedreadfromfile (String Filename)throws FileNotFoundException{
        try {
            BufferedInputStream br=new BufferedInputStream(new FileInputStream(Filename));

            int data;

            //read returns a integer value
            while((data=br.read()) != -1) {
                System.out.print((char)data);//return character
                 //System.out.println(data);//returns int 
                
               
            }
             br.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

     public static void readfromfile (String Filename)throws FileNotFoundException{
        try {
            FileInputStream input=new FileInputStream(Filename);

            int data;

            //read returns a integer value
            while ((data=input.read())!=-1) {
                System.out.print((char)data);//return character
                 //System.out.println(data);//returns int 
                
                
                
            }
             System.out.println();
            input.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }
    

    public static void main(String[] args) {
        String FileName="file.txt";
        try {
            //writetofile(FileName);
            bufferwritetofile(FileName);
            readfromfile(FileName);
            bufferedreadfromfile(FileName);
        } catch (Exception e) {
            
            e.getMessage();
        }
        



        

        
       

    }
}
