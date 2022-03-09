package Observer;

import java.util.ArrayList;

public class Bolsa {
	
	ArrayList<Agente_bolsa> observadores=new ArrayList<Agente_bolsa>();
	private String estado;
	
	public String getEstado() {
		return estado;	
	}
	public void setEstado(String a) {
		this.estado=a;
		notificarTodosObservadores();
	}
	
	public void Agregar(Agente_bolsa obs) {
		observadores.add(obs);
		
	}
	public void notificarTodosObservadores() {
		for(Agente_bolsa observador: observadores) {
			observador.actualizar(this.estado);
		}
	}
	
	

}
