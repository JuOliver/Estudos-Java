package wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste1 {
    public static void main(String[] args) {
//        Formas de adicionar arquivos sem sobrecarga
        Path p1 = Paths.get("C:\\Users\\admin\\Documents\\Estudos-Java\\file.txt");
        Path p2 = Paths.get("C:\\Users\\admin\\Documents\\Estudos-Java","file.txt");
        Path p3 = Paths.get("C:","Users\\admin\\Documents\\Estudos-Java", "file.txt");
        Path p4 = Paths.get("C:","Users","admin","Documents","Estudos-Java","file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }

}
