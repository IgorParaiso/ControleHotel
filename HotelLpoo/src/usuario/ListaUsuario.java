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
    
    public String[] nomeUser(){
        String[] resultado = new String[this.listaUsuario.size()];
        for(int i = 0; i<this.listaUsuario.size(); i++){
            resultado[i] = this.listaUsuario.get(i).getNome();
        }
        return resultado;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        for (Usuario user:this.listaUsuario){
            resultado = resultado + user.toString() + "\n";
        }
        return resultado;
    }
}
