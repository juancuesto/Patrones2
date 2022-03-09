package Observer;

public class Agencia1 extends Agente_bolsa {
	
	public Agencia1(Bolsa s) {
		this.sujeto=s;
		this.sujeto.Agregar(this);
		
	}

	@Override
	public void actualizar(String a) {
		// TODO Auto-generated method stub
		System.out.println("La bolsa esta: "+a+ " Agencia 1");
	}

}
