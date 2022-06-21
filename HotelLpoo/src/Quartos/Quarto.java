package Quartos;

import usuario.Usuario;

/**
 *
 * @author Igor Paraiso
 */
public abstract class Quarto implements Atendimento, Manutencao {
    private int andar, qntHosp;
	private char identificador;
	private boolean reservado, limpo, check_in, cafeDaManha;
	private Usuario usuario;
	private String tipoCama, vista;
	private float valorBase, fatura;
	
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
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getQntHosp() {
		return qntHosp;
	}
	public void setQntHosp(int qntHosp) {
		this.qntHosp = qntHosp;
	}

	public char getIdentificador() {
		return identificador;
	}
	public void setIdentificador(char identificador) {
		this.identificador = identificador;
	}

	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean estado) {
            this.reservado = estado;        
	}

	public boolean isLimpo() {
		return limpo;
	}
	public void setLimpo(boolean estado) {
		this.limpo = estado;
	}

	public boolean isCheck_in() {
		return check_in;
	}
	public void setCheck_in(boolean estado) {
		this.check_in = estado;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}
	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public Usuario getUsuario() {
		return usuario;
	}
        
        public void setUsuario(Usuario usuario){
            this.usuario = usuario;
        }

	public String getTipoCama() {
		return tipoCama;
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

	public float getValorBase() {
		return valorBase;
	}
	public void setValorBase(float valorBase) {
		this.valorBase = valorBase;
	}

	public float getFatura() {
		return fatura;
	}
	public void setFatura(float fatura) {
		this.fatura = fatura;
	}
        
        @Override
        public void limpar() {
		if(!this.isLimpo()){
                    this.setLimpo(true);
                }
	}
        
        @Override
        public boolean checkin() {
		if (isLimpo() && !isReservado() && !isCheck_in()){
			this.setCheck_in(true);
			this.setReservado(true);
			this.setLimpo(false);
                        this.setFatura(0);
                        return true;
		}
                return false;
	}
        
        @Override
	public double checkout() {
            this.setUsuario(new Usuario());
            this.setReservado(false);
            this.setCheck_in(false);
            
            double valorFinal = this.getValorBase() + this.getFatura();
            return valorFinal;
                
	}
        
        @Override
        public void fazerReserva(Usuario user) {
            this.usuario = user;
            this.setReservado(true);
        }
}
