package AJL3;
import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int i;
            do {
                i = fin.read();
            }while (i!=-1);
        }catch (IOException e){

        }
        finally {
            try {
                fin.close();
            }catch (IOException e){

            }
        }

    }
}

//ashafio