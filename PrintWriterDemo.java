package AJL3;
import java.io.*;

public class PrintWriterDemo {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);

        System.out.println("Leading");
        pw.println("Leading");
        pw.println(5);
    }

}
//ashafio