package hotellpoo;

public class QuartoMaster extends QuartoConfort {
    
    public QuartoMaster (int andar, char identificador, int qntHosp, boolean reservado, 
                Usuario usuario, boolean limpo, boolean checkin, String tipoCama, float valorBase, boolean cafeDaManha, String vista, float fatura, boolean hidro){
        super(andar, identificador, qntHosp, reservado, 
                usuario, limpo, checkin, tipoCama, valorBase, cafeDaManha, vista, fatura, hidro);
    }
    
    public void CharmarModomo(Quarto quarto){
        
    }
}
