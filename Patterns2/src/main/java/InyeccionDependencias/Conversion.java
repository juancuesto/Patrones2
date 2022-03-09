package InyeccionDependencias;

public class Conversion implements IConversion {
	
	private String tipo;
	private double conversion;
	
	public Conversion(String t, double c) {
		
		tipo=t;
		conversion=c;
	}

	@Override
	public String dameTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public double dameConversion() {
		// TODO Auto-generated method stub
		return conversion;
	}

	
	

}
