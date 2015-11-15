package Ejercicio1;

public class Circulo {

	private double radio;
	
	public Circulo(){
		
	}
	
	public Circulo(double radioParam){
		this.radio=radioParam;
	}
	
	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double getArea(){
		return Math.PI*radio*radio;
	}
}
