
public class Televisor {
	private int  Volumen_actual;
	private int Canal_actual;
	private boolean encendido;
	
	
	public Televisor(){
		
	}
	public Televisor(int VolumenParam,int CanalParam){
		this.Volumen_actual = VolumenParam;
		this.Canal_actual = CanalParam;
	}
	
	public void establecerVolumen(int Volumen){
		Volumen_actual = Volumen;
	}
	
	public void establecerCanal(int Canal){
		Canal_actual = Canal;
	}
	
	public int ObtenerVolumen(){
		return Volumen_actual;
	}
	
	public int Obtener_Canal(){
		return Canal_actual;
	}
	
	public void encender(){
		encendido = true;
	}
	
	public void apagar(){
		encendido = false;
	}
	
	public void Subir_Volumen(){
		if(encendido && Volumen_actual<=100)
			Volumen_actual++;
	}
	
	public void Bajar_Volumen(){
		if(encendido && Volumen_actual>0)
			Volumen_actual--;
	}
	
	public void CambiarCanalArriba(){
		if(encendido && Canal_actual<=50)
			Canal_actual++;
	}
	
	public void CambiarCanalAbajo(){
		if(encendido && Canal_actual>=1)
			Canal_actual--;
	}
	
	public String tosString(){
		return "CanalActual:" +Canal_actual+"VolumenActual:"+Volumen_actual;
	}
}