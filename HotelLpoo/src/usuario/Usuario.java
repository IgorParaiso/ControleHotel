package usuario;

public class Usuario {
	private String nome, cpf, dataNasc, paisOrigem, idiomaAtend;
	private int telefone;
	
        public Usuario(){
            
        }
        
	public Usuario (String nome, String cpf, String dataNasc, int telefone, String paisOrigem, String idiomaAtend) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.paisOrigem = paisOrigem;
		this.idiomaAtend = idiomaAtend;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public String getIdiomaAtend() {
		return idiomaAtend;
	}

	public void setIdiomaAtend(String idiomaAtend) {
		this.idiomaAtend = idiomaAtend;
	}
        
        @Override
        public String toString(){
            return nome + "," + cpf + "," + dataNasc + "," + telefone + "," + "," + paisOrigem + "," + idiomaAtend + "\n";
        }
}

	