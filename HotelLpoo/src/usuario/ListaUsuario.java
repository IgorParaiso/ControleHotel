package usuario;

import java.util.ArrayList;

public class ListaUsuario {
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