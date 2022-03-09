package InyeccionDependencias;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IConversion c1=new Conversion("Euros",1.0);
		IConversion c2=new Conversion("Dolares",1.20);
		
		IArticulo a1=new Articulo("camiseta", 15.50);
		IArticulo a2=new Articulo("pantalon", 33.25);
		
		
		//System.out.println("El precio de :"+a1.dameDescripcion()+" es de:"+a1.damePrecio(a1.damePvp()));
		
		//System.out.println(a1.damePvp());
		System.out.println("El articulo: "+ a1.dameDescripcion()+" vale: "+a1.damePrecio(a1.damePvp(), c1.dameConversion())+" en "+c1.dameTipo());
		System.out.println("El articulo: "+ a2.dameDescripcion()+" vale: "+a2.damePrecio(a2.damePvp(), c2.dameConversion())+" en "+c2.dameTipo());
		System.out.println("El articulo: "+ a1.dameDescripcion()+" vale: "+a1.damePrecio(a1.damePvp(), c2.dameConversion())+" en "+c2.dameTipo());
		System.out.println("El articulo: "+ a2.dameDescripcion()+" vale: "+a2.damePrecio(a2.damePvp(), c1.dameConversion())+" en "+c1.dameTipo());
	}


	}


