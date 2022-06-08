package hotellpoo;

public interface Atendimento {
	public void checkin (Quarto quarto);
	public void checkout(Quarto quarto);
	public String ConsultarDisponiveis (ListaQuarto listaQuartos);
	public void fazerReserva(Quarto quartos);
}
