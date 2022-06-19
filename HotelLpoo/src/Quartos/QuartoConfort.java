package Quartos;

import usuario.Usuario;

public class QuartoConfort extends Quarto {
        
    private boolean hidro;
    private static float valorBase = 40;
    
    public QuartoConfort (int andar, char identificador, int qntHosp,String tipoCama, boolean cafeDaManha, String vista, boolean hidro){
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista);
		this.hidro = hidro;
    }
    
    public QuartoConfort (int andar, char identificador, int qntHosp, boolean reservado, Usuario usuario,
			boolean limpo, boolean check_in, String tipoCama, boolean cafeDaManha,
			String vista, float fatura, boolean hidro){
        super(andar, identificador, qntHosp, reservado, usuario, limpo, check_in, tipoCama, cafeDaManha, vista, fatura);
		this.hidro = hidro;
    }
    
    public boolean isHidro() {
        return hidro;
    }

    public void setHidro(boolean hidro) {
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
    public double checkout(Quarto quarto) {
	// TODO Auto-generated method stub
        return 0;
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
    public void TrocarChuveiro(Quarto quarto) {
	if (super.isCheck_in()){
        super.setFatura(super.getFatura() + 100);
        }
    }

    @Override
    public void AbastecerToalha(Quarto quarto) {
	super.setFatura(super.getFatura() + 40);
    }
    
    @Override
        public String toString(){
            return "2," 
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
                    + super.getFatura()+ ","
                    + this.isHidro() + "\n"; 
        }
}
