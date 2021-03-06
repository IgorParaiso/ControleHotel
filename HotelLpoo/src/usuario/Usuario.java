package usuario;

public class Usuario {
	private String nome, cpf, dataNasc, paisOrigem, idiomaAtend;
	private int telefone;
	
        public Usuario(){
            this.nome = null;
            this.cpf = null;
            this.dataNasc = null;
            this.telefone = -1;
            this.paisOrigem = null;
            this.idiomaAtend = null;
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
        
        //O arqvuivo a ser gerado pelo programa é um csv, portanto o método toString foi alterado para comportar essa necessidade
        @Override
        public String toString(){
            return this.nome + "," + this.cpf + "," + this.dataNasc + "," + this.telefone + "," + this.paisOrigem + "," + this.idiomaAtend;
        }
}

	