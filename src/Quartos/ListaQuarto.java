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
    
    
}
