package Equations;

import java.math.*;

public class MechanicalsEquations {

	//Devuelve el trabajo mecanico. Calculo base de fuerza * distancia
	public double getMechanicalWork(double force, double distance) {
		
		double MW=force*distance;
		return MW;
		
	}
	
	//Devuelve el trabajo mecanico usando la formula basica compuesta
	public double getCompositeMechanicalWork(double dough, double gravity, double distance) {
		
		double MW=dough*gravity*distance;
		return MW;
		
	}
	
	//Ecuacion para hallar distancia aplicando regla de tres simples
	public double getDistance(double dough, double MW, double gravity) {
		
		double distance=MW/(dough*gravity);
		return distance;
		
	}
	
	//Devuelve la masa aplicando la regla de tres simples
	public double getDough(double MW, double gravity, double distance) {
		
		double dough=MW/(gravity/distance);
		return dough;
		
	}
	
	//Devuelve la fuerza aplicando la regla de tres simples
	public double getForce(double MW, double distance) {
		
		double force=MW/distance;
		return force;
		
	}
	
}
