package CallBack;

public class Pagament {
	
	String tipo;
	Botiga botiga;
	
	public Pagament(Botiga b, String t) {
		tipo=t;
		botiga=b;
	}
	
	public void pago(String t) {
		botiga.pagar(t);
	}

}
