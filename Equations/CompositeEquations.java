package Equations;

import java.math.*;

public class CompositeEquations {

	public double getKineticEnergy(double dough, double speed) {
		
		double KE=0.5*dough*Math.pow(speed, 2);
		return KE;
		
	}
	
	//Duevuelve la energia 
	public double getPotentialEnergy(double dough, double height, double gravity) {
		
		double PE=dough*gravity*height;
		return PE;
		
	}
	
	//Devuelve la energia mecanica a partir de los datos base de la energia mecanica y la energia cinetica
	public double getMechanicalEnergy(double dough, double speed, double height, double gravity) {
		
		double ME=dough*((0.5*Math.pow(speed, 2))+(gravity*height));
		
		return ME;
		
	}
	
	//Devuelve la energia mecanica teniendo en cuenta que ya se conoce la energia cinetica
	public double getMechanicalEnergyFormula1(double dough, double height, double gravity, double KE) {
		
		double PE=dough*gravity*height;		
		double ME=KE+PE;
		
		return ME;
		
	}
	
	//Devuelve la energia mecanica teniendo en cuenta que ya se conoce la energia potencial
	public double getMechanicalEnergyFormula2(double dough, double speed, double PE) {
		
		double KE=0.5*dough*Math.pow(speed, 2);	
		double ME=KE+PE;
		
		return ME;
		
	}
	
	//Devuelve la velocidad del objeto basado en la energia cinetica y la masa
	public double getLostSpeed(double dough, double KE) {
		
		double speed=Math.sqrt(2*KE/dough);
		return speed;
		
	}
	
	public double getPEBasedInWeight(double weight, double height) {
		
		double PE=weight*height;
		return PE;
		
	}
	
}
