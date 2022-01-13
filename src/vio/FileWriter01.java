package vio;

import java.io.*;

public class FileWriter01 {
    public static void main(String[] args) throws IOException {
        /* flush() força o conteudo do buffer a ser escrito no disco
         append serve para não subistituir o conteudo ja existente no arquivo  */
        File file = new File("arquivo.txt");
        try {
            //verifica se o arquivo ou diretorio existe
            boolean existe = file.exists();
            //cria um arquivo (vazio)
            file.createNewFile();

            //cria um diretorio
            file.mkdir();

            //caso seja um diretorio, é possivel listar seus arquivos e diretorios
            File[] files = file.listFiles();
            System.out.println(files);

            //escrever no arquivo. Append serve para não subistituir o conteudo ja existente no arquivo
            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);

            fw.write("Dev Dojoo - Maratona Java");
            bw.newLine();
            //flush() força o conteudo do buffer a ser escrito no disco
            bw.flush();
            bw.close();
            fw.close();

            //Faz a leitura do arquivo
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //Enquanto houver mais linhas, ele faz a leitura com o buffered
            String linha;
            while ((linha = br.readLine()) != null) {
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
