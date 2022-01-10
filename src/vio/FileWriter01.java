package vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        /* flush() força o conteudo do buffer a ser escrito no disco
         append serve para não subistituir o conteudo ja existente no arquivo  */
        File file = new File("arquivo.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Dev Dojoo\nCurso Java");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
