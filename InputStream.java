package AJL3;
import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do{
            c= (char) br.read();
            System.out.println(c);
        }while (c!='q');



    }

}

//ashafio

