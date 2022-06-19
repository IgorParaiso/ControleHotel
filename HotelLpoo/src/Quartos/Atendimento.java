package Quartos;

public interface Atendimento {
	public void checkin (Quarto quarto);
	public double checkout(Quarto quarto);
	public String ConsultarDisponiveis (ListaQuarto listaQuartos);
	public void fazerReserva(Quarto quartos);
}
