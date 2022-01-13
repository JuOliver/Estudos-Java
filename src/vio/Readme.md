
### java.io.File
 A classe java.io.File destina-se a obter informações sobre o arquivo e não sobre seu conteúdo. Essa classe contém vários métodos para trabalhar com o nome do caminho, excluir 
 e renomear arquivos, criar novos diretórios, listar o conteúdo de um diretório e entre outros. Essa classe apenas representa um arquivo ou diretório, e não significa que o 
 arquivo ou diretório realmente exista.
 
 O arquivo [FileWriter01](FileWriter01.java) contém um exemplo de como pode ser feita a criação de um arquivo txt, como podemos escrever no arquivo e fazer a leitura do mesmo.
 
 Para instanciar um objeto do tipo File:
 
 ```
File arquivo = new File ("caminho do arquivo");
System.out.println(arq.exists());
```
 
### java.io.FileWriter e java.io.BufferedWriter
  Ambas as classes servem para escrever em um arquivo de texto. A FileWriter escreve diretamente no arquivo, já a BufferedWriter ela salva primeiro na memória e depois envia para
  o disco, ou seja, possui um melhor desempenho. Além disso, essa classe tem alguns métodos que são independentes de SO, como a quebra de linha.

### java.io.FileReader e java.io.BufferedReader
  Essas classes servem para fazer a leitura de arquivos txt. A classe FileReader recebe como argumento o objeto File do arquivo a ser lido e a classe BufferedWriter fornece o 
  método readLine() para leitura do arquivo. Vale ressaltar que existem várias formas de fazer leitura e escrita de arquivos no Java.
