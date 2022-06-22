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
    
    //Método para procurar um usuário a partir do nome
    public Usuario getUsuario (String nome){
        for (Usuario lista : this.listaUsuario) {
            if(lista.getNome().equalsIgnoreCase(nome)){
                return lista;
            }
        }
        return null;
    }
    
    //Método para criar um vetor que irá fornecer os nomes que irão aparecer no Dropdown quando necessário
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
