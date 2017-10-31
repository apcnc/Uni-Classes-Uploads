package de.unistuttgart.iaas.pse.ex01.p1;

public class Loops {

	public static double fakultaet(double i){
		if(i==1)return 1;
		return i*fakultaet(i-1);
	}
	public static double computeEuler(int n) {
		double eulerNumber = 1.0;
		for(double i = 1; i <= n; i++){
			eulerNumber += 1/fakultaet(i); 
		}
		return eulerNumber;
	}

	public static double computeEuler(double delta) {
		double eulerNumber = 1.0;
		for(double i = 1; 1/fakultaet(i)>delta; i++){
			eulerNumber += 1/fakultaet(i); 
			
		}
		
		return eulerNumber;
		
	}

	public static int querProdukt(int n) {
		int querProduct = 1;
		while(n>0){
			querProduct *= n%10;
			n /= 10;
		}
		return querProduct;
	}

	public static void main(String[] args) {
		// to test
		System.out.println("50 steps: \n" + computeEuler(50));
		System.out.println("Until a divergence of 0.00000001: \n"
				+ computeEuler(0.00000001));
		System.out.println("Product of the Digits: \n" + querProdukt(3128));
	}

}
