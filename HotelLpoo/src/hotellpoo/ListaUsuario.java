/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotellpoo;

import java.util.ArrayList;

/**
 *
 * @author Igor Paraiso
 */
class ListaUsuario {
    private ArrayList<Usuario> listaUsuario;
    
    public ListaUsuario (){
        listaUsuario = new ArrayList<>();
    }
    
    public void cadastrar (Usuario usuario){
        this.listaUsuario.add(usuario);
    }
    
    public Usuario getUsuario (String nome){
        for (Usuario lista : this.listaUsuario) {
            if(lista.getNome().equalsIgnoreCase(nome)){
                return lista;
            }
        }
        return null;
    }
    
    public boolean remover(String nome){
        Usuario aux = this.getUsuario(nome);
        if(aux != null){
            this.listaUsuario.remove(aux);
            return true;
        }
        return false;
    }
    
}
