package Equations;

import java.math.*;

public class BasicEquations {

	public double getWeight(double dough, double gravity) {		
		
		double weight=dough*gravity;
		return weight;	
		
	}
	
	public double getForce(double dough, double aceleration) {
		
		double force=dough*aceleration;
		return force;
				
	}
	
}
