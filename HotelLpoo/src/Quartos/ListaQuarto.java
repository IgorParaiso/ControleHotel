/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quartos;

import java.util.ArrayList;

/**
 *
 * @author Igor Paraiso
 */
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
    
    public String[] quartoNums(){
        String[] resultado = new String[this.listaQuarto.size()];
        for(int i = 0; i<this.listaQuarto.size(); i++){
            resultado[i] = String.valueOf(this.listaQuarto.get(i).getAndar()) + this.listaQuarto.get(i).getIdentificador();
        }
        return resultado;
        
    }
    
    public Quarto getQuarto(int index){
        return this.listaQuarto.get(index);
    }
    
    @Override
    public String toString(){
        String resultado = "";
        for(Quarto room:this.listaQuarto){
            resultado = resultado + room.toString();
        }
        return resultado;
    }
    
}
