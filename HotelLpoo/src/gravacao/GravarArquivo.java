package gravacao;

import java.io.*;

public class GravarArquivo {
    private FileWriter writer;
    private PrintWriter saida;
    
    public GravarArquivo (String nome) throws IOException{
        try {
            writer = new FileWriter(new File(nome), true);
            
            saida = new PrintWriter(writer);
        } catch (IOException e) {
            throw new IOException ("Arquivo nao pode ser aberto para gravacao");
        }  
    }
}

