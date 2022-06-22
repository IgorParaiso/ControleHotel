package Quartos;

import usuario.Usuario;

public class QuartoMaster extends QuartoConfort {
    
    private boolean mordomo;
    private double valorBase = 80;
    
    //implementacao do construtor para a criacao de um novo quarto no sistema
    public QuartoMaster (int andar, char identificador, int qntHosp,String tipoCama, boolean cafeDaManha, String vista, boolean hidro, boolean mordomo){
        super(andar, identificador, qntHosp, tipoCama, cafeDaManha, vista, hidro);
	this.mordomo = mordomo;
    }
    
    //implementacao de um construtor para a leitura dos quartos a partir do arquivo de origem
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

    //Metodo que implementa a situacao de quando e necessario fazer a troca de um chuveiro 
    //e o valor sera cobrado do usuario, caso ele esteja hospedado no momento do defeito
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
    
    //metodo que retira um usuario de um quarto e retorna para o programa o valor a ser pago
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
