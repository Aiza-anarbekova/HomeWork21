package com.compan;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWriter();
        fileReader();

    }
    public  static void fileWriter(){
        try(FileWriter writer=new FileWriter("text.txt")){

            writer.write("A a \n");
            writer.write("B b \n");
            writer.write("C c \n ");
            writer.write("D d \n");
            writer.write("F f \n");
            writer.write("J j \n");
            writer.write("E e \n");
            writer.write("W w \n");
            writer.write("T t \n");
            writer.write("U u  \n");
            writer.write("H h \n");
            writer.write("0 \n");
            writer.write("1 \n");
            writer.write("2 \n");
            writer.write("3 \n");
            writer.write("4 \n");
            writer.write("5 \n");
            writer.write("6 \n");
            writer.write("7 \n");
            writer.write("8 \n");
            writer.write("9 \n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void fileReader(){
        try(FileReader reader= new FileReader("text.txt")) {
            Scanner scanner=new Scanner(reader);
            int a=1;
            while (scanner.hasNextLine()){
                System.out.println(a+": "+scanner.nextLine());
                a++;

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
