package Quartos;

import java.util.ArrayList;

public class ListaQuarto {
    private ArrayList<Quarto> listaQuarto;
    
    public ListaQuarto (){
        listaQuarto = new ArrayList<>();
    }
    
    public void CadastrarSimples (QuartoSimples quarto){
        this.listaQuarto.add(quarto);
    }
    
    public void CadastrarConfort (QuartoConfort quarto){
        this.listaQuarto.add(quarto);
    }
    
    public void CadastrarMaster (QuartoMaster quarto){
        this.listaQuarto.add(quarto);
    }
    
    public Quarto getQuarto(int index){
        return this.listaQuarto.get(index);
    }
    
    public int busca(String quarto){
        for (int i = 0; i<this.listaQuarto.size(); i++){
            if (this.numeroQuarto(this.listaQuarto.get(i)).equalsIgnoreCase(quarto)){
                return i;
            }
        }
        return -1;
    }
    
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
    
    public String[] quartoNums(){
        String[] resultado = new String[this.listaQuarto.size()];
        for(int i = 0; i<this.listaQuarto.size(); i++){
            resultado[i] = this.numeroQuarto(this.listaQuarto.get(i));
        }
        return resultado;
    }
    
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
