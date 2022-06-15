package gravacao;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import usuario.Usuario;

public class LerArquivo {
    private Scanner entrada;
    
    public LerArquivo (String nome) throws FileNotFoundException{
        try {
            this.entrada = new Scanner(new File(nome));
        } catch (FileNotFoundException e){
            throw new FileNotFoundException("Arquivo nao encontrada");
        }
    }

    public ArrayList<Usuario> lerUsuario() throws ArrayIndexOutOfBoundsException, NumberFormatException{
        ArrayList<Usuario> user = new ArrayList<>();
        String linha;
        
        while (this.entrada.hasNext()){
            linha = this.entrada.nextLine();
            user.add(separarDados(linha));
        }
        return user;
    }
    
    private Usuario separarDados(String linha) throws ArrayIndexOutOfBoundsException, NumberFormatException{
        String[] dados=null;
        int num;
        try{
            dados = linha.split(",");
            num = Integer.parseInt(dados[3]);
            return (new Usuario(dados[0], dados[1], dados[2], num, dados[4], dados[5]));
        } catch (ArrayIndexOutOfBoundsException erro){
			throw new ArrayIndexOutOfBoundsException ("REGISTRO TEM "+dados.length+" INFORMACOES");
        }catch (NumberFormatException erro){
                throw new NumberFormatException ("NUMERO DA CONTA NAO E INTEIRO");
        }
    }
    
    public void fecha() throws IllegalStateException{
        try {
            this.entrada.close();
        } catch (IllegalStateException e){
            throw new IllegalStateException("Erro ao fechar arquivo");
        }
    }
}
