package Quartos;

import java.util.ArrayList;

public class ListaQuarto {
    private ArrayList<Quarto> listaQuarto;
    
    public ListaQuarto (){
        listaQuarto = new ArrayList<>();
    }
    
    //Método para criação de um quarto simples
    public void CadastrarSimples (QuartoSimples quarto){
        this.listaQuarto.add(quarto);
    }
    
    //Método para criação de quarto confort
    public void CadastrarConfort (QuartoConfort quarto){
        this.listaQuarto.add(quarto);
    }
    
    //Método para criacao de um quarto maste
    public void CadastrarMaster (QuartoMaster quarto){
        this.listaQuarto.add(quarto);
    }
    
    //metodo para buscar um quarto a partir de um indíce
    public Quarto getQuarto(int index){
        return this.listaQuarto.get(index);
    }
    
    //método que retorna o indice de um quarto no ArrayList a partir do seu identificador
    public int busca(String quarto){
        for (int i = 0; i<this.listaQuarto.size(); i++){
            if (this.numeroQuarto(this.listaQuarto.get(i)).equalsIgnoreCase(quarto)){
                return i;
            }
        }
        return -1;
    }
    
    //metodo que consulta quais são os quartos disponiveis para locação, não considera as condicoes do quarto
    public String[] buscarDisponiveis(){
        String[] disponiveis = new String[this.listaQuarto.size()];
        int i =0;
        for(Quarto room:this.listaQuarto){
            if(!room.isCheck_in() && !room.isReservado()){
                disponiveis[i]= this.numeroQuarto(room);
                i++;
            }
        }
        return disponiveis;
    }
    
    //metodo que consulta quais são os quartos em que foi feito um checkin
    public String[] buscarOcupados(){
        String[] ocupado = new String[this.listaQuarto.size()];
        int i =0;
        for(Quarto room:this.listaQuarto){
            if(room.isCheck_in()){
                ocupado[i]= this.numeroQuarto(room);
                i++;
            }
        }
        return ocupado;
    }
    
    //metodo que implementa a busca dos quartos que foram reservados, mas ainda não estão ocupados
    public String[] buscarReservados(){
        String[] reservado = new String[this.listaQuarto.size()];
        int i =0;
        for(Quarto room:this.listaQuarto){
            if(!room.isCheck_in() && room.isReservado()){
                reservado[i]= this.numeroQuarto(room);
                i++;
            }
        }
        return reservado;
    }
    
    //metodo que gera um vetor com os numeros de todos os quartos do hotel
    public String[] quartoNums(){
        String[] resultado = new String[this.listaQuarto.size()];
        for(int i = 0; i<this.listaQuarto.size(); i++){
            resultado[i] = this.numeroQuarto(this.listaQuarto.get(i));
        }
        return resultado;
    }
    
    //metodo que formata o identificador do quarto a partir do andar e da letra
    public String numeroQuarto(Quarto room){
        return String.valueOf(room.getAndar()) + "-" + room.getIdentificador();
    }
    
    @Override
    public String toString(){
        String resultado = "";
        for(Quarto room:this.listaQuarto){
            resultado = resultado + room.toString() + "\n";
        }
        return resultado;
    }
    
}
