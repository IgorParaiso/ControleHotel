package Quartos;

import usuario.Usuario;

public class QuartoMaster extends QuartoConfort {
    
    private boolean mordomo;
    private static float valorBase = 80;
    
    public QuartoMaster (int andar, char identificador, int qntHosp,String tipoCama, boolean cafeDaManha, String vista, boolean hidro, boolean mordomo){
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista, hidro);
	this.mordomo = mordomo;
    }
    
    public QuartoMaster (int andar, char identificador, int qntHosp, boolean reservado, Usuario usuario,
			boolean limpo, boolean check_in, String tipoCama, boolean cafeDaManha,
			String vista, float fatura, boolean hidro, boolean mordomo){
        super(andar, identificador, qntHosp, reservado, usuario, limpo, check_in, tipoCama, cafeDaManha, vista, fatura, hidro);
		this.mordomo = mordomo;
    }

    public boolean isMordomo() {
        return mordomo;
    }

    public void setMordomo(boolean mordomo) {
        this.mordomo = mordomo;
    }
    
     @Override
    public void checkin(Quarto quarto) {
    	// TODO Auto-generated method stub
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
        super.setFatura(super.getFatura() + 200);
        }
    }

    @Override
    public void AbastecerToalha(Quarto quarto) {
	super.setFatura(super.getFatura() + 80);
    }
    
    @Override
        public String toString(){
            return "3," 
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
                    + super.isHidro() + ","
                    + this.isMordomo() + "\n"; 
        }
}
