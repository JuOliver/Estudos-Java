package vio;

import java.io.*;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        /* flush() força o conteudo do buffer a ser escrito no disco
         append serve para não subistituir o conteudo ja existente no arquivo  */
        File file = new File("arquivo.txt");

        try {
            if (!file.exists()) {
                //cria um arquivo (vazio)
                file.createNewFile();
            }

            //caso seja um diretorio, é possivel listar seus arquivos e diretorios
            File[] files = file.listFiles();

            //escrever no arquivo
            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);

            fw.write("Dev Dojoo\nCurso Java\nMaratona");
            bw.close();
            fw.close();

            //Faz a leitura do arquivo
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //Enquanto ouver mais linhas, ele faz a leitura com o buffered
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
            br.close();
            fr.close();

/*          Outra forma de ler o arquivo
            String path = ("C:\\Users\\admin\\Documents\\Estudos-Java\\arquivo.txt");
            List<String> reader = Files.readAllLines(Paths.get(path));
            System.out.println(reader);  */
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
