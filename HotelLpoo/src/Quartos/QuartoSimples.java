package Quartos;

import usuario.Usuario;


public class QuartoSimples extends Quarto {
    
    private static double valorBase = 20;
    public QuartoSimples(int andar, char identificador, int qntHosp, String tipoCama, boolean cafeDaManha, String vista) {
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista);
	}
    
    public QuartoSimples(int andar, char identificador, int qntHosp, boolean reservado, String nome, String cpf, String dataNasc, int telefone, String paisOrigem, String idiomaAtend, boolean limpo, 
            boolean checkin, String tipoCama, boolean cafeDaManha, String vista, float fatura){
        
        super(andar, identificador, qntHosp, reservado, nome, cpf, dataNasc, telefone, paisOrigem, idiomaAtend, limpo, checkin,tipoCama, cafeDaManha, vista, fatura);
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
	public double checkout() {
            super.setUsuario(new Usuario());
            super.setReservado(false);
            super.setCheck_in(false);
            
            double valorFinal = valorBase + super.getFatura();
            return valorFinal;
                
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
            + super.getFatura(); 
    }
}
