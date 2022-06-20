package gravacao;

import Quartos.*;
import java.io.*;
import java.util.Scanner;
import usuario.*;

public class LerArquivo {
    private Scanner entrada;
    
    public LerArquivo (String nome) throws FileNotFoundException{
        try {
            this.entrada = new Scanner(new File(nome));
        } catch (FileNotFoundException e){
            throw new FileNotFoundException("Arquivo nao encontrada");
        }
    }

    public ListaUsuario lerUsuario() throws ArrayIndexOutOfBoundsException, NumberFormatException{
        ListaUsuario user = new ListaUsuario();
        String linha;
        
        while (this.entrada.hasNext()){
            linha = this.entrada.nextLine();
            String[] dados = separarDados(linha);
            try{
                int tel = Integer.parseInt(dados[3]);
                user.cadastrar(new Usuario(dados[0], dados[1], dados[2], tel, dados[4], dados[5]));
            } catch (NumberFormatException erro){
                throw new NumberFormatException ("NUMERO DE TELEFONE NAO E INTEIRO");
            }            
        }
        return user;
    }
    
    public ListaQuarto lerQuartos() throws ArrayIndexOutOfBoundsException, NumberFormatException{
        ListaQuarto quarto = new ListaQuarto();
        String linha;
        
        while(this.entrada.hasNext()){
            linha = this.entrada.nextLine();
            String[] dados = separarDados(linha);
            try {
                int tipo = Integer.parseInt(dados[0]);
                int andar = Integer.parseInt(dados[1]);
                int qntHosp = Integer.parseInt(dados[3]);
                int telefone = Integer.parseInt(dados[8]);
                float fatura = Float.parseFloat(dados[16]);
                    
                boolean reservado = Boolean.parseBoolean(dados[4]);
                boolean limpo = Boolean.parseBoolean(dados[11]);
                boolean checkin = Boolean.parseBoolean(dados[12]);
                boolean cafe = Boolean.parseBoolean(dados[14]);
                
                switch (tipo){
                    case 1 -> quarto.CadastrarSimples(new QuartoSimples(andar, dados[2].charAt(0), qntHosp, reservado, dados[5], dados[6], dados[7], telefone, dados[9], dados[10], limpo,
                                checkin, dados[8],cafe, dados[10], fatura));
                    case 2 -> {
                        boolean hidro1 = Boolean.parseBoolean(dados[17]);
                        quarto.CadastrarConfort(new QuartoConfort(andar, dados[2].charAt(0), qntHosp, reservado, dados[5], dados[6], dados[7], telefone, dados[9], dados[10], limpo,
                                checkin, dados[8],cafe, dados[10], fatura, hidro1));
                    }
                    case 3 -> {
                        boolean hidro2 = Boolean.parseBoolean(dados[17]);
                        boolean mordomo = Boolean.parseBoolean(dados[18]);
                        quarto.CadastrarMaster(new QuartoMaster(andar, dados[2].charAt(0), qntHosp, reservado, dados[5], dados[6], dados[7], telefone, dados[9], dados[10], limpo,
                                checkin, dados[8],cafe, dados[10], fatura, hidro2, mordomo));
                    }
                }  
            } catch (NumberFormatException e) {
                throw new NumberFormatException ("NUMERO DE TELEFONE NAO E INTEIRO");
            }
            
        }
        return quarto;
    }
    
    private String[] separarDados(String linha) throws ArrayIndexOutOfBoundsException, NumberFormatException{
        String[] dados=null;
        try{
            dados = linha.split(",");
            return dados;
        } catch (ArrayIndexOutOfBoundsException erro){
			throw new ArrayIndexOutOfBoundsException ("REGISTRO TEM "+ (dados.length-1) +" INFORMACOES");
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
