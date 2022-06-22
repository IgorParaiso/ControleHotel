package gravacao;

import java.io.*;

public class GravarArquivo {
    private FileWriter writer;
    private PrintWriter saida;
    
    
    public GravarArquivo (String nome) throws IOException{
        try {
            writer = new FileWriter(new File(nome), false);
            
            saida = new PrintWriter(writer);
        } catch (IOException e) {
            throw new IOException ("Arquivo nao pode ser aberto para gravacao");
        }  
    }
    
    public void grava (String str){
        this.saida.print(str);
    }
    
    public void fecha() throws IOException{
        try {
            this.saida.close();
            this.writer.close();
        } catch (IOException e){
            throw new IOException ("Erro ao fechar o arquivo");
        }
    }
}

