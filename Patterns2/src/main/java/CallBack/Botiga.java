package CallBack;

public class Botiga {
	
	public Botiga(){
		
		Pagament p= new Pagament(this,"efectivo");
		//p.pago("efectivo");
	}
	
	public void pagar(String t) {
		System.out.println("el pago se ha hecho con: "+t);
		
	}
	
}
