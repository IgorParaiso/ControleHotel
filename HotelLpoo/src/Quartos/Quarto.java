package Quartos;

import usuario.Usuario;


public abstract class Quarto implements Atendimento, Manutencao {
    
    private int andar, qntHosp;
    private char identificador;
    private boolean reservado, limpo, check_in, cafeDaManha;
    private Usuario usuario;
    private String tipoCama, vista;
    private float fatura;
    private static double valorBase;
	
    
        //implementacao do construtor para a criacao de um novo quarto no sistema
	public Quarto(int andar, char identificador, int qntHosp, String tipoCama, boolean cafeDaManha,
			String vista){
		this.andar = andar;
		this.identificador = identificador;
		this.qntHosp = qntHosp;
		this.reservado = false;
                this.usuario = new Usuario();
		this.limpo = true;
		this.check_in = false;
		this.tipoCama = tipoCama;
		this.cafeDaManha = cafeDaManha;
		this.vista = vista;
		this.fatura = 0;
	}
        
        //implementacao de um construtor para a leitura dos quartos a partir do arquivo de origem
        public Quarto(int andar, char identificador, int qntHosp, boolean reservado, String nome, String cpf, String dataNasc, int telefone, String paisOrigem, String idiomaAtend,
			boolean limpo, boolean check_in, String tipoCama, boolean cafeDaManha,
			String vista, float fatura){
		this.andar = andar;
		this.identificador = identificador;
		this.qntHosp = qntHosp;
		this.reservado = reservado;
		this.usuario = new Usuario(nome, cpf, dataNasc, telefone, paisOrigem, idiomaAtend);
		this.limpo = limpo;
		this.check_in = check_in;
		this.tipoCama = tipoCama;
		this.cafeDaManha = cafeDaManha;
		this.vista = vista;
		this.fatura = fatura;
	}

	public int getAndar() {
		return this.andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getQntHosp() {
		return this.qntHosp;
	}
	public void setQntHosp(int qntHosp) {
		this.qntHosp = qntHosp;
	}

	public char getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(char identificador) {
		this.identificador = identificador;
	}

	public boolean isReservado() {
		return this.reservado;
	}
	public void setReservado(boolean estado) {
            this.reservado = estado;        
	}

	public boolean isLimpo() {
		return this.limpo;
	}
	public void setLimpo(boolean estado) {
		this.limpo = estado;
	}

	public boolean isCheck_in() {
		return this.check_in;
	}
	public void setCheck_in(boolean estado) {
		this.check_in = estado;
	}

	public boolean isCafeDaManha() {
		return this.cafeDaManha;
	}
	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}
        
        public void setUsuario(Usuario usuario){
            this.usuario = usuario;
        }

	public String getTipoCama() {
		return this.tipoCama;
	}
	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}

	public String getVista() {
		return vista;
	}
	public void setVista(String vista) {
		this.vista = vista;
	}

	public float getFatura() {
		return this.fatura;
	}
	public void setFatura(float fatura) {
		this.fatura = fatura;
	}
        
        
        //metodo que altera o estado do quarto de sujo para limpo
        @Override
        public void limpar() {
		if(!this.isLimpo()){
                    this.setLimpo(true);
                }
	}
        
        //metodo que torna o quarto ocupado, e muda o status de limpo para sujo
        @Override
        public boolean checkin() {
		if (isLimpo()){
			this.setCheck_in(true);
			this.setReservado(true);
			this.setLimpo(false);
                        this.setFatura(0);
                        return true;
		}
                return false;
	}
        
        //metodo que vincula um usuario a um quarto e altera o seu status de livre para reservado
        @Override
        public void fazerReserva(Usuario user) {
            this.usuario = user;
            this.setReservado(true);
        }
}
