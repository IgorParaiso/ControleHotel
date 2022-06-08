package hotellpoo;

public class QuartoSimples extends Quarto {
    
    public QuartoSimples(int andar, char identificador, int qntHosp, boolean reservado,
			Usuario usuario, boolean limpo, boolean checkin, String tipoCama,
			float valorBase, boolean cafeDaManha, String vista, float fatura) {
		super(andar, identificador, qntHosp, reservado, usuario, limpo, checkin,
				tipoCama, valorBase, cafeDaManha, vista, fatura);
	}

	@Override
	public void checkin(Quarto quarto) {
		if (isLimpo() == true && isReservado() == false && isCheck_in() == false){
			setCheck_in(true);
			setReservado(true);
			setLimpo(false);
		}
	}

	@Override
	public void checkout(Quarto quarto) {
		float valorFinal = getValorBase() + getFatura();
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
	public void limpar(Quarto quarto) {
		float valor = 5;
	}

	@Override
	public void TrocarChuveiro(Quarto quarto) {
		float valor = 50;
		if(isCheck_in() == true){
			
		}
	}

	@Override
	public void AbastecerToalha(Quarto quarto) {
		float valor = 20;
	}
}
