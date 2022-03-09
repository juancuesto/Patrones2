package Observer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bolsa b=new Bolsa();
		
		new Agencia1(b);
		new Agencia2(b);
		
		
		b.setEstado("subiendo");
		System.out.println("------------------");
		b.setEstado("Bajando");


	}

}
