
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Televisor tv1;
		tv1=new Televisor();
		tv1.establecerVolumen(50);
		tv1.establecerCanal(10);
		
		
		Televisor tv2;
		tv2=new Televisor(50, 10);
		
		System.out.println(tv1);
		System.out.println(tv2);
		
		
		
		
		
		
		
		
		/*Televisor tv1;
		tv1 = new Televisor();
		tv1.encender();
		tv1.Subir_Volumen();
		tv1.Subir_Volumen();
		tv1.Subir_Volumen();
		tv1.CambiarCanalArriba();
		tv1.CambiarCanalArriba();
		System.out.println("tv1 Volumen:" +tv1.ObtenerVolumen());
		System.out.println("tv1 Canal:" +tv1.Obtener_Canal());
		
		Televisor tv2 = new Televisor();
		tv2.encender();
		tv2.establecerCanal(50);
		tv2.establecerVolumen(89);
		System.out.println("tv2 Volumen:" +tv2.ObtenerVolumen());
		System.out.println("tv2 Canal:" +tv2.Obtener_Canal());
		
		Televisor tv3 = tv2;
		
		tv3.Subir_Volumen();
		tv3.Subir_Volumen();
		System.out.println("tv2 Volumen:" +tv2.ObtenerVolumen());
		System.out.println("tv2 Canal:" +tv3.ObtenerVolumen());*/
		
	}

}
