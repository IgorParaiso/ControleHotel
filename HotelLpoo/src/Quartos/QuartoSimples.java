package Quartos;

import usuario.Usuario;

public class QuartoSimples extends Quarto {
    
    private static float valorBase = 20;
    public QuartoSimples(int andar, char identificador, int qntHosp, String tipoCama, boolean cafeDaManha, String vista) {
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista);
	}
    
    public QuartoSimples(int andar, char identificador, int qntHosp, boolean reservado, Usuario usuario, boolean limpo, 
            boolean checkin, String tipoCama, boolean cafeDaManha, String vista, float fatura){
        
        super(andar, identificador, qntHosp, reservado, usuario, limpo, checkin,tipoCama, cafeDaManha, vista, fatura);
    }

	@Override
	public void checkin(Quarto quarto) {
		if (isLimpo() == true && isReservado() == false && isCheck_in() == false){
			super.setCheck_in();
			super.setReservado();
			super.setLimpo();
		}
	}

	@Override
	public double checkout(Quarto quarto) {
		double valorFinal = super.getValorBase() + super.getFatura();
                return valorFinal;
	}

	@Override
	public String ConsultarDisponiveis(ListaQuarto listaQuartos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerReserva(Quarto quartos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TrocarChuveiro() {
		if(super.isCheck_in()){
                    super.setFatura(super.getFatura() + 50);
		}
	}

	@Override
	public void AbastecerToalha() {
            if(super.isCheck_in()){
                super.setFatura(super.getFatura() + 20);
            }
	}
        
        @Override
        public String toString(){
            return "1," 
                    + super.getAndar() + "," 
                    + super.getIdentificador() + "," 
                    + super.getQntHosp() + "," 
                    + super.isReservado() + "," 
                    + super.getUsuario() + "," 
                    + super.isLimpo() + "," 
                    + super.isCheck_in() + ","
                    + super.getTipoCama() + ","
                    + super.isCafeDaManha() + "," 
                    + super.getVista() + "," 
                    + super.getFatura()+ "\n"; 
        }
}
