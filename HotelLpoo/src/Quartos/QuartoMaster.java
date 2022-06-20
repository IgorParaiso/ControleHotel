package Quartos;

import usuario.Usuario;

public class QuartoMaster extends QuartoConfort {
    
    private boolean mordomo;
    private static float valorBase = 80;
    
    public QuartoMaster (int andar, char identificador, int qntHosp,String tipoCama, boolean cafeDaManha, String vista, boolean hidro, boolean mordomo){
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista, hidro);
	this.mordomo = mordomo;
    }
    
    public QuartoMaster (int andar, char identificador, int qntHosp, boolean reservado, String nome, String cpf, String dataNasc, int telefone, String paisOrigem, String idiomaAtend,
			boolean limpo, boolean check_in, String tipoCama, boolean cafeDaManha,
			String vista, float fatura, boolean hidro, boolean mordomo){
        super(andar, identificador, qntHosp, reservado, nome, cpf, dataNasc, telefone, paisOrigem, idiomaAtend, limpo, check_in, tipoCama, cafeDaManha, vista, fatura, hidro);
		this.mordomo = mordomo;
    }

    public boolean isMordomo() {
        return mordomo;
    }

    public void setMordomo(boolean mordomo) {
        this.mordomo = mordomo;
    }
    
    public void chamarMordomo(){
        super.setFatura(super.getFatura() + 200);
    }

    @Override
    public void TrocarChuveiro() {
	if (super.isCheck_in()){
        super.setFatura(super.getFatura() + 200);
        }
    }

    @Override
    public void AbastecerToalha() {
	if (super.isCheck_in()){
            super.setFatura(super.getFatura() + 80);
        }
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
            + this.isMordomo(); 
        }
}
