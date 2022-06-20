package Quartos;

import usuario.Usuario;

public class QuartoConfort extends Quarto {
        
    private boolean hidro;
    private static float valorBase = 40;
    
    public QuartoConfort (int andar, char identificador, int qntHosp,String tipoCama, boolean cafeDaManha, String vista, boolean hidro){
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista);
		this.hidro = hidro;
    }
    
    public QuartoConfort (int andar, char identificador, int qntHosp, boolean reservado, String nome, String cpf, String dataNasc, int telefone, String paisOrigem, String idiomaAtend,
			boolean limpo, boolean check_in, String tipoCama, boolean cafeDaManha,
			String vista, float fatura, boolean hidro){
        super(andar, identificador, qntHosp, reservado, nome, cpf, dataNasc, telefone, paisOrigem, idiomaAtend, limpo, check_in, tipoCama, cafeDaManha, vista, fatura);
		this.hidro = hidro;
    }
    
    public boolean isHidro() {
        return hidro;
    }

    public void setHidro(boolean hidro) {
        this.hidro = hidro;
    }
    
    public void limparHidro(){
        super.setFatura(super.getFatura() + 40);
    }
    
    public void chamarServico(){
        super.setFatura(super.getFatura() + 50);
    }

    @Override
    public void TrocarChuveiro() {
	if (super.isCheck_in()){
            super.setFatura(super.getFatura() + 100);
        }
    }

    @Override
    public void AbastecerToalha() {
	if (super.isCheck_in()){
            super.setFatura(super.getFatura() + 40);
        }
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
            + this.isHidro(); 
        }
}
