package Quartos;

import usuario.Usuario;

public interface Atendimento {
	public boolean checkin ();
	public double checkout();
	public void fazerReserva(Usuario user);
}
