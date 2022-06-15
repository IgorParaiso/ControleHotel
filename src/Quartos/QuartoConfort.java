package Quartos;

import usuario.Usuario;

public class QuartoConfort extends Quarto {
        
    private boolean hidro;
    
    public QuartoConfort (int andar, char identificador, int qntHosp, boolean reservado, 
                Usuario usuario, boolean limpo, boolean checkin, String tipoCama, float valorBase, boolean cafeDaManha, String vista, float fatura, boolean hidro){
        super(andar, identificador, qntHosp, reservado, 
                usuario, limpo, checkin, tipoCama, valorBase, cafeDaManha, vista, fatura);
		this.hidro = hidro;
    }

    @Override
    public void checkin(Quarto quarto) {
    	/*if (get.limpar() && get.fazerReserva(usuario.Usuario) && checkin == false){
            checkin = true;
	}
	return false;*/
    }

    @Override
    public void checkout(Quarto quarto) {
	// TODO Auto-generated method stub
    }

    @Override
    public String ConsultarDisponiveis(ListaQuarto listaQuartos) {
	// TODO Auto-generated method stub
        return "";
    }

    @Override
    public void fazerReserva(Quarto quartos) {
        // TODO Auto-generated method stub
    }

    @Override
    public void limpar(Quarto quarto) {
	// TODO Auto-generated method stub
    }

    @Override
    public void TrocarChuveiro(Quarto quarto) {
	// TODO Auto-generated method stub
    }

    @Override
    public void AbastecerToalha(Quarto quarto) {
	int value = 10;
	float fatura = 0;
	fatura = fatura + 10;
    }
}
